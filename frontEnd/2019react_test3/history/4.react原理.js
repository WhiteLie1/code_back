import React from 'react';
import ReactDOM from 'react-dom';
/**
 * 1.react是一个用户界面的库
 * 2.react元素 JSX元素 其实就是一个用JS来描述界面的对象
 * <div><span>hello</span></div>
 */
// ReactDOM.render(
//     <div><span>hello</span></div>,
//     document.querySelector('#root')
// );
//经过webpack转译后变成下面形式
ReactDOM.render(
    React.createElement('div',null,[React.createElement('span',null,['hello'])]),
    document.querySelector('#root'));

/*
/*<div>
        <span className="red"
        style={{backgroundColor:'green'}}>Hello World!</span>
    </div>,document.querySelector("#root")

<ydiv1 cls="ee">hello</ydiv1>,document.querySelector("#root")
 */