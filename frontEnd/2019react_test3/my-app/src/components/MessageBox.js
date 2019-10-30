import React,{Component} from 'react'
import MessageList from "./MessageList";
import MessageFrom from "./MessageForm";
export default class MessageBox extends Component{
    constructor(){
        super();
        //定义默认的状态对象 message是消息数组
        this.state = {messages:[{username:'张三',content:'今天天气很好',createAt: new Date()}]};
    }
    render(){
        return (
            <div className="container">
                <div className="row">
                    <div className="col-sm-8 col-sm-offset-2">
                        <div className="panel panel-default">
                            <div className="panel-heading">
                                <h2 className="text-center">欢迎来到留言中心</h2>
                            </div>
                            <div className="panel-body">
                               <MessageList messages={this.state.message}/>
                            </div>
                            <div className="panel-footer">
                                <MessageFrom/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}