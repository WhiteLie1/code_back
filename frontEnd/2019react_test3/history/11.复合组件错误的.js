import React from 'react'
import {render} from 'react-dom'
import 'bootstrap/dist/css/bootstrap.css'
//复合组件
class Panel extends Comment{
    render(){
        return(
            <div className="panel panel-default">
                <PanelHead head={this.props.head}/>
                <PanelBody body={this.props.body}/>
                <PanelFooter footer={this.props.footer}/>
            </div>
        )
    }
}
class PanelHead extends Comment{
    render(){
        return <div className="panel-heading">{this.props.head}</div>

    }


}
class PanelBody extends Comment{
    render(){
        return(
            <div className="panel-body">
                {this.props.body}

            </div>
        )
    }

}
class PanelFooter extends Comment{
    render(){
        return(
            <div className="panel-footer">
                {this.props.footer}
            </div>
        )
    }

}
render(<Panel head="头" body="体" footer="尾"/>,document.querySelector("#root"))