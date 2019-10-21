import React from 'react';


class ShoppingList extends React.Component{
    render(){
        return(
            <div className="shopping-list">
                <h1>Shopping List for{this.props.name}</h1>
                <ul>
                    <li>Instagram</li>
                    <li>WhatApp</li>
                    <i>Oculus</i>
                </ul>

            </div>
        )


    }
}

import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <p>
                    Edit <code>src/App.js</code> and save to reload.
                </p>
                <a
                    className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Learn React
                </a>
            </header>
        </div>
    );
}

export default App;

/** hello.js
 * import React from 'react';
 import ReactDOM  from 'react-dom';

 class HelloMessage extends React.Component {
    render() {
        return <div>Hello {this.props.name}</div>;
    }
}

 // 加载组件到 DOM 元素 mountNode
 ReactDOM.render(<HelloMessage name="John" />, document.getElementById("root"));
 */

/*
class App extends Component{
    render() {
        return(
            <div className={App}>
                <p>Hello,很高兴在react里面与你相遇！</p>
                <p>接下来的日子我们一起走！</p>
            </div>
        );
    }
}
 */

/*
class ShoppingList extends React.Component{
    render() {
        return(
            <div className="shopping-list">
                <h1>Shopping List for {this.props.name}</h1>
                <ul>
                    <li>Instragram</li>
                    <li>WhatsApp</li>
                    <li>Oculus</li>
                </ul>


            </div>
            )

    }
}
export default ShoppingList;
 */

/*
import React,{Component} from 'react'
import './App.css'
import {Text,View} from 'react-native'

export default class HelloWorldApp extends Component{
    render() {
        return(
          <View style={{flex:1,justifyContent:"center",alignItems:"center"}}>
              <Text>Hello,World!</Text>
          </View>
        );
    }
}

 */