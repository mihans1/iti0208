<template>
    <div>
        <div>
            <navbar/>
        </div>
        <div id="app">
            <HelloWorld/>
        </div>
    </div>
</template>

<script>
    import HelloWorld from './components/HelloWorld.vue'
    import Navbar from "./Navbar";

    export default {
        name: 'app',
        components: {
            Navbar,
            HelloWorld
        }
    }
</script>

<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 60px;
    }
</style>
