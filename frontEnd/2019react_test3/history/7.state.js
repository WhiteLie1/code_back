//计时器
//函数方式声明的组件是静态的，是不能动的
/*let Clock = ()=>{
    return <h1>{new Date().toLocaleString()}</h1>
}
setInterval(function () {
    render(<Clock/>,window.app)
},1000)
*/
//通过类来声明一个组件,类继承于Component
class Clock extends Component{
    //设置一个状态量
    constructor(){
        super();
        //自定义组件状态对象
        //状态可以用来存放组件内部一些变化的值，状态只能由内部初始化，内部改变
        this.state={time:new Date().toLocaleString()}
    }
    //生命周期函数,组件挂载完成
    componentDidMount() {
        //每隔一秒钟会重新修改状态，当调用setState之后，状态会更新，还会再次调用render方法进行重写渲染
        window.setInterval(()=>{
            this.setState({time:new Date().toLocaleString()})
        },1000);
    }

    //render方法指的是该组件要如何渲染，一定要返回一个React元素，而且只能返回一个React元素
    render() {
        return <h1><span>Hello</span><span>{this.state.time}</span></h1>
    }
}
render(<Clock/>,window.app)
