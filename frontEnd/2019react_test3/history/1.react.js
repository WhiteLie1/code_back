import React from 'react';
import ReactDOM from 'react-dom';
//render的含义iu是把一个React元素渲染到DOM容器内部
//jsx javascript+html（xml)的混合写法
ReactDOM.render(
    <h1>hello</h1>,
    document.querySelector('#root')
);
//react元素是通过js对象来描述DOM的结构的一种数据结构
// ReactDOM.render(
//     React.createElement('h1',null,['hello'])
// )