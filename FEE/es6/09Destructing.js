let names = ['Mohtashim','Kannan','Kiran']
let [n1,n2,n3] = names;
console.log(n1)
console.log(n2)
console.log(n3);
//rest operator with array destructuring
let locations=['Mumbai','Hyderabad','Chennai']
let [l1,...otherValues] =locations
console.log(l1)
console.log(otherValues)
//variables already declared
let name1,name2;
[name1,name2] =names
console.log(name1)
console.log(name2)
//swapping
let first=10,second=20;
[second,first] = [first,second]
console.log("second is ",second) //10
console.log("first is ",first) //20

let {myname,myage} = {myage:34,myname:"arunachalam"};
console.log(myname);
console.log(myage);
