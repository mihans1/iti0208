<template>
    <div class="add">

        <add msg="Add new object"/>
    </div>
</template>

<script>
    const add = {
        props: ['msg'],
        render(h) {
            return h('div', [
                h('h1', 'New object'),
                h('div', this.msg)
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
    .add{
        background-color: #4caf50;
    }
</style>