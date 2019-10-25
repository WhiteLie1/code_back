import React from 'react'
import {render} from 'react-dom'
//非受控组件，非受控元素
class Sum extends React.Component{
    handleChange = (event)=>{
        console.log(this.refs)
        let a = parseInt(this.a.value);
        let b = parseInt(this.refs.b.value);
        this.refs. result.value=a+b;
    }
    render(){
        //ref等于一个函数，表示当元素被挂载到页面之后会立刻调用此函数，并传入渲染后的DOM元素
        return(
            <div onChange={this.handleChange}>
                <input ref={ref=>this.a=ref} type="text" />+
                <input ref = "b" type="text"/>=
                <input ref="result"type="text"/>
            </div>
        )
    }
}
/*
* 当我们去用ReactDom去渲染的Sum组件的时候，才会去创建sum类的实例，然后调用render方法得到一个顶级的react元素，
* 然后把此react元素转换成真实的DOM对象，并插入到容器里面
* */
render(<Sum/>,document.querySelector("#root"))