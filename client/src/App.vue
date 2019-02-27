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
    import About from "./components/About.vue"

    export default {
        name: 'app',
        components: {
            Navbar,
            About,
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
