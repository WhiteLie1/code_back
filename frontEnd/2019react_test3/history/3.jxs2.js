let names = ['大毛','','三毛'];
//{}里面放的是js表达式，表达式是由变量的运行符组合而成
// 1+1 a+b fn(1) 必须有一个返回值
let style={backgroundColor:'green'};
ReactDOM.render(
    <div>
        {
            names.map(function (item,index) {
                return item.length>0?<span style={style}className="red" key={index}>{item}</span>:null
            })
        }
    </div>,document.querySelector('#root')
);