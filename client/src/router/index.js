import Vue from 'vue';
import Router from 'vue-router';
import About from '@/components/About';
import App from '@/App';
import AddObject from "../components/AddObject";
import Home from '@/Home';
Vue.use(Router)
export default new Router({
    routes: [
        {
            path: '/',
            name: 'App',
            component: App
        },
        {
            path: '/about',
            name: 'About',
            component: About
        },
        {
            path: '/add',
            name: AddObject,
            component: AddObject
        },
        {
            path: '/home',
            name: Home,
            component: Home
        }
    ]
});
