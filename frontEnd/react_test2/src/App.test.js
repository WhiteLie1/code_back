import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

it('renders without crashing', () => {
  const div = document.createElement('div');
  ReactDOM.render(<App />, div);
  ReactDOM.unmountComponentAtNode(div);
});

/*
import React from 'react';
import logo from './logo.svg';
import './App.css';
import Header from "./componemt/header";
function App() {
  return (
    <div className="App">
      <Header name = "reactname"/>
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

 */

/*
import React,{Component} from "react";
import {Text,View} from "react-native/Libraries/Core/Devtools/symbolicateStackTrace";
export default class HelloWorldApp extends Component{
    render() {
        return(
            <View style={{flex:1,justifyContent:'center',alignItems:"center"}}>
                <Text>Hello,World!</Text>
            </View>
        )
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
                    <li>sdjksljkalgjklag</li>
                </ul>
            </div>

        )
    }
}
export default ShoppingList;
 */

/*
import './App.css';

class Board extends React.Component{
    renderSquare(i){
        // eslint-disable-next-line react/jsx-no-undef
        return <Square value={i}/>;
    }
}
export default Board;
 */

/*
import React from 'react';
import logo from './logo.svg';
import './App.css';
import Header from "./componemt/header";
import Game from "./test_game"
function App() {
    return (
        <div className="App">
            <Header name = "reactname"/>
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
 */