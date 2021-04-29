var names = new Array("Mary","Tom","Jack","Jill") 
for(var i = 0;i<names.length;i++) { 
   console.log(names[i]) 
}

var numbers = [1, 2, 3,4,5,6,7,8,9,20]; 
var oddNumber = numbers.find((x) => x % 2 == 0); 
console.log(oddNumber); // 2

var numbers1 = [1, 2, 3]; 
var oddNumber1 = numbers1.findIndex((x) => x % 2 == 1); 
console.log(oddNumber1); // 0

var names2 = ["test", "skip", "cip"]; 
var val = names2.entries(); 
console.log(val.next().value);  
console.log(val.next().value);  
console.log(val.next().value);


var numbers3 = [1, 2, 3]; 
var val3= numbers3.entries(); 
console.log([...val3]);

"use strict" 
for (let ii of Array.from('hello')) { 
   console.log(ii) 
}

var arr = ["orange", "mango", "banana", "sugar", "tea"]; 
console.log("arr.slice( 1, 2) : " + arr.slice( 1, 2) );
console.log("arr.slice( 1, 3) : " + arr.slice( 1, 3) ); 
console.log("arr.slice( 1, 4) : " + arr.slice( 1, 4) );
console.log("arr.slice( 1) : " + arr.slice( 1) ); 

var arr2 = new Array("orange", "mango", "banana", "sugar"); 
var sorted = arr2.sort(); 
console.log("Returned string is : " + sorted ); 