<template>
    <div>
        <div id="app">
            <Navbar/>
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
            Map,
            Navbar
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
