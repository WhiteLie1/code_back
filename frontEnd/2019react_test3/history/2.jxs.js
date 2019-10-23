import React from 'react';
import ReactDOM from 'react-dom';
//声明来一个React元素
let ele = <h1>Hello</h1>;
console.log(ele);
//标签类型 属性对象 子元素
//1此处写的属性名都要转成驼峰命名法
//2.有些属性是js关键字，要换种写法
//let _ele2 = React.createElement('div',null,[React.createElement('span',null,['hello'])]);
// console.log(_ele2)
//let _ele2 = <div><span>hello</span></div>
let _ele2 = React.createElement('div',{id:1},{className:'red'},['Hello']);
console.log(_ele2)
//最终的react元素是这样的
let eleObj = {type:'div',props:{
        className: 'red',
        children:['hello',
            {
                type:'span',props:{className:'blue',children: ['word']}
            }]
    }};
function render(eleObj,container) {
    //先解构出标签的类型和属性对象
    let {type,props} = eleObj;
    //创建一个react元素
    let ele = document.createElement(type);
    //循环属性对象
    for(let attr in props){
        if(attr == 'children'){
            props[attr].forEach(function (item) {
                if(typeof item == 'string'){
                    let textNode = document.createTextNode(item);
                    ele.appendChild(textNode);//把节点数据添加上去
                }else{
                    render(item,ele)
                }

            });
        }else if(attr =='className'){
            ele.setAttribute('class',props[attr])

        }
        else{
            ele.setAttribute(attr,props[attr])
        }
    }


    container.appendChild(ele)
}
render(eleObj,document.querySelector('#root'))
//ReactDOM.render(_ele2,document.querySelector('#root'))