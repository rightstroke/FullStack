y = 89;       // It will not cause an error.  
console.log(y);
example();  
function example() {  
  "use strict";  
  var x = 89;   // It will cause an error  
  console.log(x);
}  