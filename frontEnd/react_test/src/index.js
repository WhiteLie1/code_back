import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App'; //倒入组建库

import * as serviceWorker from './serviceWorker';
import {register} from "./serviceWorker";

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
ReactDOM.render(<App />,document.getElementById('root'));//把react组件渲染到DOM中

serviceWorker.unregister();
