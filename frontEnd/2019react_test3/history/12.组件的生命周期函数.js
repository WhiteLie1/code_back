import React,{Component} from 'react'
import {render} from 'react-dom'
import 'bootstrap/dist/css/bootstrap.css'

/**
 * 1.组件的完整生命周期
 * 2.一些代码的编写的顺序
 * 3.
 */
class Counter extends Component{
    constructor(){
        super();
        this.state = {num:0};
    }
    //组件将要被挂载
    componentWillMount() {
        console.log('1.compontwillMount组件将要被挂载')
    }

    handleClick = ()=>{
        //setState方法是异步的，所以不能在赋值之后立即获取最新的state值
        //可以在回调函数当中获取最新的值状态值
        this.setState({
            num:this.state.num+1
        },()=>{
            //这是一个异步的,所以放在这个函数后面才能在控制台与渲染层进行同步加显示数字
            console.log(this.state.num)
        });

    }
    //newProps 新的属性对象
    //newState 新的状态对象
    shouldComponentUpdate(newProps,newState) {
        console.log('4.shouldComponentUpdate组件是否要进行更新')
        if(newState.num%5===0){
            return true;
        }else{
            return false;
        }
    }
    //组件将要更新
    componentWillUpdate(nextProps, nextState, nextContext) {
        console.log('5.componentWillUpdate组件将要更新')
    }
    componentDidUpdate(prevProps, prevState, snapshot) {
        console.log('6.componentDidUpdate组件更新完成')
    }

    render() {
        console.log("2.render组件被挂载")
        return(
            <div style={{border:'1px solid red',padding:'5px'}}>
                <p>{this.state.num}</p>
                <button onClick={this.handleClick}>+</button>
                <SubCounter num={this.state.num}/>
            </div>
        )

    }
    componentDidMount() {
        console.log('3.componentDidMount组件挂载完成')
    }
}
//子计数器
class SubCounter extends Component{
    //组件将要接收到新的属性对象
    componentWillReceiveProps(newProps) {
        console.log('SubCount componentWillReceiveProps')
    }
    shouldComponentUpdate(nextProps, nextState, nextContext) {
        console.log('这是nextProps的值',nextProps)
        if(nextProps.num%3===0){
            return true;
        }else{
            return false;
        }
    }

    render() {
        return(
            <div style={{border:'1px solid blue'}}>
                <p>{this.props.num}</p>
            </div>
        )
    }
}
render(<Counter/>,document.querySelector("#root"))