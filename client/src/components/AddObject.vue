<template>
    <div id="a" @load="getObjectTypes">
        <add/>
        <v-form id="obj-add" method="post" @submit="addObject">
            <div id="type">
                <label for="obj-type"><h3>Choose obstacle type</h3></label>
                <v-select id="obj-type" name="objectType" v-model="objectType"
                          :options="objectTypes" label="type" item-text="type" item-value="id">{{objectType}}
                </v-select>
            </div>
            <div>
                <p/>
                <label for="loc"><h3>Pick obstacle location</h3></label>
                <p/>
                <area alt="o" id="loc">
                Siin voiks pisike map olla??? <p/>
                <v-text-field
                        value="Description"
                        hint="For example a car on the pavement or no passing"
                ></v-text-field>

                <input type="file"/>
                <p/>
                <button v-on:click.prevent="addObject">Add obstacle</button>
            </div>
        </v-form>
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
        methods: {
            getObjectTypes: function () {
                this.$http.get('http://localhost:8080/api/objectTypes').then(function (response) {
                    this.objectTypes = response.body;
                })
            },
            addObject: function () {
                this.$http({method: 'POST', url: 'http://localhost:8080/api/object'})
                    .then(function (response) {
                        this.object = response.body;
                    })
            }
        },
        mounted() {
            this.getObjectTypes();
            this.addObject();
        }
    }

</script>

<style scoped>
    #a {
        text-align: center;
        font-family: 'Source Sans Pro', 'Helvetica Neue', Arial, sans-serif;
    }

    #type {
        width: 40%;
        alignment: center;
        margin-left: 30%;
    }
</style>