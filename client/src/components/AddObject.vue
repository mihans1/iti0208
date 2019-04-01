<template>
    <div id="a" @load="getObjectTypes">
        <add/>
        <form id="obj-add" method="post">
            <div>
                <label for="obj-type">Choose obstacle type</label>
                <v-select id="obj-type" name="objectType" v-model="objectType"
                          :options="objectTypes" label="Select obstacle" item-text="type" item-value="id">{{objectType}}
                </v-select>
            </div>
        </form>
        {{objectTypes}}
        {{objectType}}
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
        components: {
            add
        },
        data() {
            return {
                objectTypes: {},
                objectType: null
            }
        },
        methods:{
            getObjectTypes: function () {
                this.$http.get('http://localhost:8080/api/objecttype/all').then(function (response) {
                    this.objectTypes = response.data;
                })
            }
        },
        mounted(){
            this.getObjectTypes();
        }
    }

</script>

<style scoped>
    #a {
        text-align: center;
    }

</style>