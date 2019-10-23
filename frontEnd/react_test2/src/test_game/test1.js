import React from 'react';
import ReactDOM from 'react-dom';
// class Square extends React.Component{
//     render() {
//         return(
//             <button className="square" onClick={() => alert('click')}>
//                 {this.props.value}
//             </button>
//         );
//     }
// }

//TODO 功能组件 function Square
function Square(props) {
    return (
        <button className="square" onClick= {props.onClick}>
            {props.value}
        </button>
    );

}
//添加一个构造函数，用来初始化状态
// class Square extends React.Component{
//     constructor(props){
//         super(props);
//         this.state ={
//             value:null,
//         };
//     }
//     render() {
//         //TODO: use onclick = {this.props.onClick}
//         //TODO:replace this.state.value with this.props.value
//         return(
//             <button className="square"
//                     //TODO:onClick={() => this.setState({value:'X'})}>
//                 //{this.state.value}
//                 onClick={()=> this.props.onClick()}>
//                 {this.props.value}
//             </button>
//         );
//     }
// }

class Board extends React.Component{
    //添加构造函数，将board的初始状态设置为包含9个null的数组，对应9个正方形
    constructor(props){
        super(props);
        this.state = {
            squares:Array(9).fill(null),
            xIsNext:true,
        };
    }
    //添加handleClick类
    handleClick(i){
        const history = this.state.history;
        const current = history[history.length-1];
        const squares = current.squares.slice();

        if(calculateWinner(squares) || squares[i]) {
            return;
        }
        squares[i] = this.state.xIsNext ? 'X':'0';//TODO ???
        this.setState({
            history:history.concat([{
                squares:squares,
            }]),

            xIsNext:!this.state.xIsNext,

        });
    }

    renderSquare(i){//renderSquare方法中，更改代码将一个称为prop的prop传递value给Square
        return (
            <Square
                value={this.state.squares[i]}
                onClick={()=> this.handleClick(i)}/>
        );
    }
    render() {
        const winner = calculateWinner(this.state.squares);
        let status;
        if(winner){
            status = 'Winner:'+winner;
        }else{
            status = 'Next player:X'+(this.state.xIsNext ? 'X':'0');
        }

        return(
            <div>
                <div className="status">{status}</div>
                <div className={"board-row"}>
                    {this.renderSquare(0)}
                    {this.renderSquare(1)}
                    {this.renderSquare(2)}
                </div>
                <div className={"board-row"}>
                    {this.renderSquare(3)}
                    {this.renderSquare(4)}
                    {this.renderSquare(5)}
                </div>
                <div className={"board-row"}>
                    {this.renderSquare(6)}
                    {this.renderSquare(7)}
                    {this.renderSquare(8)}
                </div>

            </div>
        );
    }
}

class Game extends React.Component{
    constructor(props){
        super(props);
        this.state={
            history:[{
                squares: Array(9).fill(null),
            }],
            xIsNext:true,
        };
    }
    //用最新的历史记录条目来确定和显示游戏状态
    render() {
        const history = this.state.history;
        const current = history[history.length-1];
        const winner = calculateWinner(current.squares);

        let status;
        if(winner){
            status = 'Winner:'+winner
        }else{
            status = 'Next Player:'+(this.state.xIsNext?'X':'o');
        }
        return(
            <div className="game">
                <div className="game-board">
                    <Board
                        squares={current.squares}
                        onClick={(i)=> this.handleClick(i)}
                    /></div>
                <div className="game-info">
                    <div>{status}</div>
                    <o1>{/*TODO*/}</o1>
                </div>
            </div>
        );
    }
}
//=================================
//ReactDOM.render(<App />, document.getElementById('root'));
ReactDOM.render(
    <Game />,
    document.getElementById('root')
);

function calculateWinner(squares) {
    const lines=[
        [0,1,2],
        [3,4,5],
        [6,7,8],
        [0,3,6],
        [1,4,7],
        [2,5,8],
        [0,4,8],
        [2,4,6],
    ];
    for (let i = 0 ;i<lines.length;i++){
        const [a,b,c] = lines[i];
        if(squares[a] && squares[a] ===squares[b] && squares[a] ===squares[c]){
            return squares[a];
        }
    }
    return null;
}

history =[
    //before first move
    {
        squares: [
            null,null,null,
            null,null,null,
            null,null,null,
        ]
    },
    //after first move
    {
        squares: [
            null,null,null,
            null,'X',null,
            null,null,'0',
        ]
    },
    //... TODO
]
