const myfunc = (age,...arg)=>{
    let result = age;
    for(var i=0;i<arg.length;i++){
        result += arg[i];
    }
    return result;    
}

console.log(myfunc(1,6,7,8,9));
