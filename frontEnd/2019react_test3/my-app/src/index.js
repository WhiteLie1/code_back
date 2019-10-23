import React from 'react';
import ReactDOM from 'react-dom';
/**
 *组件的两种定义方式以及他们之间的区别
 */
let Message = (msg) =>{
    return <h1>{msg}</h1>
}
ReactDOM.render(
    <Message/>,app)
);


