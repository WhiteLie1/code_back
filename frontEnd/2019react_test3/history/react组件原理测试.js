let Message = ({props}) =>{
    console.log(props);
    return <h1>{props.msg}</h1>

}
render(
    <Message msg="hello" id="5"/>,window.app);