const numbers = [1,2,3,4,5,67];

const newNumbers = [12,23,34,...numbers];

console.log(newNumbers.length);

console.log(newNumbers.map(Math.sqrt));

console.log(newNumbers.map(x=>x*3));

const abcd = newNumbers.map(x=>{
    console.log("In ArrowFunction1.." + x);
    return x*4;
}).map(xx=>{
    console.log("In ArrowFunction2.." + xx);
    return xx+1;
}).filter(y=>y>130);

console.log(abcd);

const originalData = [
    { "investor": "Sue",   "value":  5,   "investment": "stocks"  },
    { "investor": "Rob",   "value": 15,   "investment": "options" },
    { "investor": "Sue",   "value": 25,   "investment": "savings" },
    { "investor": "Rob",   "value": 15,   "investment": "savings" },
    { "investor": "Sue",   "value":  2,   "investment": "stocks"  },
    { "investor": "Liz",   "value": 85,   "investment": "options" },
    { "investor": "Liz",   "value": 16,   "investment": "options" },
  ];

  const abcd2 =originalData.find(x=> x.investor=="Liz");

  console.log(abcd2);

