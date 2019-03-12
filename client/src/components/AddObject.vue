<template>
    <div id="a">
        <add/>
    </div>
</template>

<script>
    const add = {
        render(h) {
            return h('div', [
                h('h1', 'ADD NEW OBJECT'),
            ])
        }
    };
    export default {
        name: "hhh",
        components:{
            add
        }
    }

</script>

<style scoped>
    #a{
        text-align: center;
    }
</style>