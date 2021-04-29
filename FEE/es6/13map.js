var map = new Map(); 
map.set('name','Tutorial Point'); 
var a = map.get('name'); // Tutorial point

console.log(map);
console.log(a);

map.set(1,true); 
console.log(map.has("1")); //false 
map.set("1",true); 
console.log(map.has("1")); //true

var roles = new Map(); 
roles.set('r1', 'User') 
.set('r2', 'Guest') 
.set('r3', 'Admin'); 
console.log(roles);
console.log(roles.has('r1'))

var roles2 = new Map([ 
    ['r1', 'User'], 
    ['r2', 'Guest'], 
    ['r3', 'Admin'], 
 ]);  
 console.log(roles2.get('r2'))



 var roles3 = new Map([ 
    ['r1', 'User'], 
    ['r2', 'Guest'], 
    ['r3', 'Admin'], 
 ]);  
 console.log(`value of key r1 before set(): ${roles3.get('r1')}`) 
 roles3.set('r1','superUser') 
 console.log(`value of key r1 after set(): ${roles3.get('r1')}`)


'use strict' 
var roles4 = new Map([ 
   ['r1', 'User'], 
   ['r2', 'Guest'], 
   ['r3', 'Admin'], 
]);
for(let r of roles4.entries()) 
    console.log(`${r[0]}: ${r[1]}`);

//https://www.tutorialspoint.com/es6/es6_collections.htm