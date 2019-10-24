let str = 'msg="hello" id="5"';
let querystring = require('qureystring');
let obj = querystring.parse(str,' ','=');

console.log(obj);