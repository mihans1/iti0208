<template>
    <div id="a" >
        <add/>
        <v-form id="obj-add" method="post">
            <div id="type">
                <label for="obj-type"><h3>Choose obstacle type</h3></label>
                <select id="obj-type" name="objectType" v-model="objectType"
                          label="type" item-text="type" item-value="id">
                    <option disabled value="">SELECT OBSTACLE</option>
                    <option>DANGEROUS MANHOLE COVER</option>
                    <option>CAR PARKED ON SIDEWALK</option>
                    <option>ANGRY POLITICIANS</option>
                    <option>SNOWDRIFT</option>
                    <option>POTHOLE</option>
                    <option>MUPO</option>
                </select>
            </div>
            <div>
                <p/>
                <label for="loc"><h3>Pick obstacle location</h3></label>
                <p/>
                <area alt="o" id="loc">
                <v-text-field
                        value="Description"
                        hint="For example a car on the pavement or no passing"
                        v-model="message"></v-text-field>
                <div class="columns">
                    <div class="column">
                        <label class="label" for="class_lat" >Latitude</label>
                        <p class="control"><input id="class_lat"
                                                  class="input"
                                                  type="number"
                                                  pattern="[0-9]{2}.[0-9]{6}"
                                                  name=""
                                                  v-model="lat" ></p>
                    </div>
                    <div class="column">
                        <label class="label" for="class_lng">Longitude</label>
                        <p class="control"><input id="class_lng" class="input" pattern="[0-9]{2}.[0-9]{6}" type="text" name="" v-model="lng" ></p>
                    </div>
                </div>
                <coordinate-input :drag-marker="true" @select="addLocation" :lat="lat" :lng="lng"
                                  lat-name="lat-name" lng-name="lng-name" api-key=""/>
                <button type="submit" v-on:click="addLocation">Add obstacle</button>
                <input type="file"/>
            </div>
        </v-form>
    </div>
</template>
<script>


    import CoordinateInput from "@lassehaslev/vue-coordinate-input/dist/components/CoordinateInput";
    const add = {
        render(h) {
            return h('div', [
                h('h1', 'ADD NEW OBJECT'),
            ])
        }
    };

    export default {
        name: "hhh",
        components: {
            CoordinateInput,
            add
        },
        data() {
            return {
                objectTypes: {},
                objectType: null,
                lat: 0,
                lng: 0
            }
        },
        methods: {
            geolocation: function () {
                if (navigator.geolocation) {
                    navigator.geolocation.getCurrentPosition(
                        function (error) {
                            alert(error.message);
                        }, {
                            enableHighAccuracy: true
                            , timeout: 5000
                        }
                    );
                } else {
                    alert("Geolocation is not supported by this browser.");
                }
            },

            getObjectTypes: function () {
                this.$http.get('http://localhost:8080/api/objectTypes').then(function (response) {
                    this.objectTypes = response.body;
                })
            },
            addLocation: function() {
                this.$http({method: 'POST', url: 'http://localhost:8080/api/locations'})

                .then(function (response) {
                            response.send(
                        )
                    })
            },
        },
        mounted() {
            this.getObjectTypes();
        }
    }

</script>

<style scoped>
    #a {
        text-align: center;
        font-family: 'Source Sans Pro', 'Helvetica Neue', Arial, sans-serif;
    }

    #type {
        width: 40%;
        alignment: center;
        margin-left: 30%;
    }
</style>