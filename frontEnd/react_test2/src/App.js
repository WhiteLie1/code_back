import React,{Component} from "react";
import {Text,View} from "react-native/Libraries/Core/Devtools/symbolicateStackTrace";
export default class HelloWorldApp extends Component{
    render() {
        return(
            <View style={{flex:1,justifyContent:'center',alignItems:"center"}}>
                <Text>Hello,World!</Text>
            </View>
        )
    }
}