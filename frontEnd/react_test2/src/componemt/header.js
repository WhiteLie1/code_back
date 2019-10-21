import React, {Component} from "react";
export default class Header extends Component{
    constructor(props){
        super(props);
        this.state={
            displyflag:false
        };
        this.clickshow = this.clickshow.bind(this);
    }
    clickshow(){
        this.setState({
            displyflag:!this.state.displyflag
        })
    }
    render() {
        let showdiv={
            display:this.state.displyflag?"block":"none"
        };
        return(
            <div>{this.props.name}
            <div className="btn" onclick={this.clickshow}>按钮</div>
                <div className="hides" style={showdiv}>内容</div>
            </div>
        )
    }
}