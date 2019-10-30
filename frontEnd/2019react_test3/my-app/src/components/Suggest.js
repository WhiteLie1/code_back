import React,{Component} from 'react'
import jsonp from 'jsonp'
/**
 * 1.给input绑定值改变事件，当值发生改变的时候调用对应的监听函数
 * 2.获取input框中的值，然后调用歹百度的接口获取数据并修改状态对象中words属性
 */
export default class Suggest extends Component{
    constructor(){
        super();
        this.state = {
            words:[],
            index:-1 //当前选中的索引

        };

    }
    handleChangle = (event)=>{//调用百度接口来查询字符
        let wd = event.target.value;
        //缓存用户输入的关键字
        this.wd = wd;
        jsonp(`http://www.baidu.com/su?wd=${wd}`,{
            param:'cb'
        },(err,data)=>{
            console.log(data);
            this.setState({words:data.s});
        });
    }
    handleKeyDown = (event)=>{//判断按键上下浮动来
        let code = event.keyCode;
        //当按下的是向上还是向下剪头键的时候
        if(code === 38 || code ===40){
            let index = this.state.index;
            if(code === 38){
                index--;
                if(index === -2){
                    index = this.state.words.length -1
                }
            }else if(code === 40){
                index++;
                if(index === this.state.words.length){
                    index = -1
                }
            }
            //键盘上下件键按下后自行更改状态
            this.setState({index})
        }else if(event.keyCode === 13){
            window.location.href =  `http://www.baidu.com/s?wd=${event.target.value}`
        }
    }



    render() {
        return(
            <div className="container">
                <div className="row">
                    <div className="col-sm-8 col-sm-offset-2">
                       <div className="pannel pannel-default">
                           <div className="pannel-heading">
                               <input   value={this.state.index ===-1?this.wd:this.state.words[this.state.index]} onKeyDown={this.handleKeyDown} type="text" className="form-control" onChange={this.handleChangle}/>
                           </div>
                           <div className="pannel-body">
                               <ul className="list-group">
                                   {
                                       this.state.words.map((word,index)=>(
                                           <li key={index} className={"list-group-item "+(index===this.state.index?
                                           'active':'')}>{word}</li>
                                       ))
                                   }
                               </ul>
                           </div>
                       </div>
                    </div>

                </div>
            </div>
        )
    }
}

/*import React,{Component} from 'react'
import jsonp from 'jsonp'
/**
 * 1.给input绑定值改变事件，当值发生改变的时候调用对应的监听函数
 * 2.获取input框中的值，然后调用歹百度的接口获取数据并修改状态对象中words属性

export default class Suggest extends Component{
    constructor(){
        super();
        this.state = {
            words:[],
            index:-1 //当前选中的索引

        };

    }
    handleChangle = (event)=>{//调用百度接口来查询字符
        let wd = event.target.value;
        //缓存用户输入的关键字
        this.wd = wd;
        jsonp(`http://www.baidu.com/su?wd=${wd}`,{
            param:'cb'
        },(err,data)=>{
            console.log(data);
            this.setState({words:data.s});
        });
    }
    handleKeyDown = (event)=>{//判断按键上下浮动来
        let code = event.keyCode;
        //当按下的是向上还是向下剪头键的时候
        if(code === 38 || code ===40){
            let index = this.state.index;
            if(code === 38){
                index--;
                if(index === -2){
                    index = this.state.words.length -1
                }
            }else if(code === 40){
                index++;
                if(index === this.state.words.length){
                    index = -1
                }
            }
            //键盘上下件键按下后自行更改状态
            this.setState({index})
        }
    }
    enter = (event)=>{//按下回车键函数
        if(event.keyCode === 13){
            window.location.href =   `http://www.baidu.com/s?wd=${event.target.value}`
        }
    }
    render() {
        return(
            <div className="container">
                <div className="row">
                    <div className="col-sm-8 col-sm-offset-2">
                        <div className="pannel pannel-default">
                            <div className="pannel-heading">
                                <input onKeyUp={this.enter}  value={this.state.index ===-1?this.wd:this.state.words[this.state.index]} onKeyDown={this.handleKeyDown} type="text" className="form-control" onChange={this.handleChangle}/>
                            </div>
                            <div className="pannel-body">
                                <ul className="list-group">
                                    {
                                        this.state.words.map((word,index)=>(
                                            <li key={index} className={"list-group-item "+(index===this.state.index?
                                                'active':'')}>{word}</li>
                                        ))
                                    }
                                </ul>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}*/