<template>
    <div>
        <GmapMap
                :center="{lat:59.436962, lng:24.753574}"
                :zoom="7"
                map-type-id="terrain"
                style="width: 1920px; height: 1080px"
        >
            <GmapMarker
                    :key="index"
                    v-for="(m, index) in markers"
                    :position="m.position"
                    :clickable="true"
                    :draggable="true"
                    @click="center=m.position"
            />
        </GmapMap>
    </div>
</template>

<script>
    export default {
        name: 'HelloWorld',
        data() {
            return {
                msg: ""
            };
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    h3 {
        margin: 40px 0 0;
    }

    ul {
        list-style-type: none;
        padding: 0;
    }

    li {
        display: inline-block;
        margin: 0 10px;
    }

    a {
        color: #42b983;
    }
</style>
