import React ,{Component} from 'react';
import ReactDOM,{render} from 'react-dom';
import PropTypes from 'prop-types'
/**
 * 受控组件 受当前状态控制
 * 非受控组件
 */
class Input extends React.Component{
    constructor(props) {
        super(props);
        this.state={val:''}
    }
    handleChange = (event)=>{

        let val = event.target.value;
        this.setState({val})

    }

    render() {
        return(
            <div>
                <p>{this.state.val}</p>
                <input onChange={this.handleChange} type="text" value={this.state.val}/>
            </div>
        )
    }
}
render(<Input />,document.querySelector("#root"))