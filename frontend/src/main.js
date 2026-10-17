import { createApp } from 'vue'; import ElementPlus from 'element-plus'; import 'element-plus/dist/index.css'; import './theme.css'; import * as Icons from '@element-plus/icons-vue'; import App from './App.vue';
const app=createApp(App); Object.entries(Icons).forEach(([k,v])=>app.component(k,v)); app.use(ElementPlus).mount('#app');
