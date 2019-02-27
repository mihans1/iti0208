<template>
    <div>
        <div id="app">
            <Map/>
        </div>
    </div>
</template>

<script>
    import Map from './components/Map.vue'
    import Navbar from "./Navbar";

    export default {
        name: 'app',
        components: {
            Navbar,
            Map
        }
    }
</script>

<style>
    #app {
        height: 100%;
    }
    body {
        margin: 0;
    }
</style>
