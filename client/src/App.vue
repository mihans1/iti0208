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
    import About from "./components/About.vue"

    export default {
        name: 'app',
        components: {
            Navbar,
            HelloWorld,
            About
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

    body{
        min-height: 320px;
        min-width:640px;        /* Suppose you want minimum width of 1000px */
        width: auto !important;  /* Firefox will set width as auto */
        width:640px;            /* As IE6 ignores !important it will set width as 1000px; */
    }
</style>
