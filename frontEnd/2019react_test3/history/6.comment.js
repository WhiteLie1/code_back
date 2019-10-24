import React from 'react';
import ReactDOM,{render} from 'react-dom';

/* let Message = ({msg,id}) =>{
            return <h1>{msg}</h1>
        }
        render(
        <Message msg="Hello" id="5" style={{color:'red'}} hobby={['a','b','c']}><Message/>,window.app
); */
/**
 *组件的两种定义方式以及他们之间的区别
 * 1.组件定义的第一种方法是函数，参数是属性对象
 * {msg:"hello",id:"5"}
 *2.组件的首字母一定是大写字母
 * 3.组件定义完了以后可以像React元素一样使用
 * 组件的渲染过程：
 * 1.封装props对象
 * 2.调用组件函数，得到返回的React元素
 * 3.ReactDOM把react元素转换成真实的DOM元素并且插入到目标容器内部
 */
let Message = (props) =>{
    return <h1 style={props.style}>{props.msg}</h1>
}
render(
    <Message msg="Hello" id="5" style={{color:'red'}} hobby={['a','b','c']}></Message>,window.app
);




