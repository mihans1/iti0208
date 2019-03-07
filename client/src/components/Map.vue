<template>
    <div>
        <GmapMap
                :center="{lat:currentLocation.lat, lng:currentLocation.lng}"
                :zoom="16"
                map-type-id="terrain"
                style="width: 100vw; height:94vh;"
        >
            <GmapMarker
                    :key="index"
                    v-for="(m, index) in markers"
                    :position="m.objectLocation"
                    :clickable="true"
                    :draggable="false"
                    @click="toggleInfoWindow(m,index)"
            />

            <gmap-info-window
                    :options="infoOptions"
                    :position="infoWindowPos"
                    :opened="infoWinOpen"
                    @closeclick="infoWinOpen=false"
            >
                <div v-html="infoContent"></div>
            </gmap-info-window>
        </GmapMap>
    </div>
</template>

<script>
    export default {
        name: 'Map',
        data() {
            return {
                currentLocation: {lat: 0, lng: 0},
                markers: [],
                infoContent: '',
                infoWindowPos: {
                    lat: 0,
                    lng: 0
                },
                infoWinOpen: false,
                currentMidx: null,
                infoOptions: {
                    pixelOffset: {
                        width: 0,
                        height: -35
                    }
                }
            };
        },
        mounted: function () {
            let self = this
            this.$http.get('http://localhost:8080/api/object/all').then((res) => {
                self.markers = res.body
            })
            this.geolocation();
        },
        methods: {
            geolocation: function () {
                navigator.geolocation.getCurrentPosition((position) => {
                    this.currentLocation = {
                        lat: position.coords.latitude,
                        lng: position.coords.longitude
                    };
                });
            },
            toggleInfoWindow: function (marker, idx) {
                this.infoWindowPos = marker.objectLocation;
                this.infoContent = this.getInfoWindowContent(marker);


                //check if its the same marker that was selected if yes toggle
                if (this.currentMidx == idx) {
                    this.infoWinOpen = !this.infoWinOpen;
                }
                //if different marker set infowindow to open and reset current marker index
                else {
                    this.infoWinOpen = true;
                    this.currentMidx = idx;
                }
            },

            getInfoWindowContent: function (marker) {
                return (`<div class="card">
                  <div class="card-image">
                    <figure class="image is-4by3">
                      <img src="https://bulma.io/images/placeholders/96x96.png" alt="Placeholder image">
                    </figure>
                  </div>
                  <div class="card-content">
                    <div class="media">
                      <div class="media-content">
                        <p class="title is-4">${marker.title}</p>
                      </div>
                    </div>
                    <div class="content">
                      ${marker.description}
                    </div>
                  </div>
                </div>`);
            },
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
