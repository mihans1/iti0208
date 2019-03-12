<template>
    <div>
        <div id="app">
            <navbar/>
            <router-view/>
        </div>
    </div>
</template>

<script>
    import Navbar from "./Navbar";
    export default {
        name: 'app',
        components: {
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
