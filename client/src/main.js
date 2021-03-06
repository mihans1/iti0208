import Vue from 'vue'
import App from './App.vue'
import * as VueGoogleMaps from 'vue2-google-maps'
import router from './router'
import vSelect from 'vue-select'
Vue.component('v-select', vSelect)

Vue.config.productionTip = false

import VueResource from 'vue-resource';
import Vuetify from 'vuetify'

Vue.use(Vuetify)
Vue.use(VueResource);

Vue.use(VueGoogleMaps, {
    load: {
        key: 'AIzaSyDqUg6REy00DK0SMufqPULw0o7N5VjTyPU',
        libraries: 'places' // This is required if you use the Autocomplete plugin
        // OR: libraries: 'places,drawing'
        // OR: libraries: 'places,drawing,visualization'
        // (as you require)

        //// If you want to set the version, you can do so:
        // v: '3.26',
    }
})

new Vue({
    render: h => h(App),
    router,
}).$mount('#app')

