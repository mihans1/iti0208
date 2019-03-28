<template>
    <div id="a">
        <add/>
        <v-select id="mySelect" :options="[
        {label: 'Lumehang', value: '4'},
        {label: 'Valesti pargitud auto', value: '3'},
        {label: 'Kaevuluuk', value: '2'},
        {label: 'Porilomp', value: '1'}]"></v-select>
        <br />
        <input v-model="message" placeholder="DESCRIPTION">
        <br />
        <button type="button">SUBMIT</button>
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