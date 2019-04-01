<template>
    
</template>

<script>
    import LocationPickerInit from 'vue-location-picker/src/init'
    import LocationPicker from 'vue-location-picker'
    new Vue({
        el: 'body',
        ready (){
            LocationPickerInit(this,{key:''})
        }
    })
    export default {
        name: "Location"
    }
</script>

<style scoped>

</style>