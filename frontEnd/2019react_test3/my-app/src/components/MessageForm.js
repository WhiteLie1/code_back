import React,{Component} from 'react'
export default class MessageFrom extends Component{
    render(){
        return(
            <form>
                <div className="form-group">
                    <label htmlFor="username" className="control-label">
                        用户名
                    </label>
                </div>
            </form>
        )
    }
}