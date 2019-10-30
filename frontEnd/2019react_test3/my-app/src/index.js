import React,{Component} from 'react';
import {render} from 'react-dom';
import 'bootstrap/dist/css/bootstrap.css'
import Suggest from "./components/Suggest";
import MessageBox from "./components/MessageBox";
render(<MessageBox/>,document.querySelector("#root"))