let income = 100000
const INTEREST_RATE = 0.08
income += 50000 // mutable
console.log("changed income value is ",income)
INTEREST_RATE += 0.01
console.log("changed rate is ",INTEREST_RATE) //Error: not mutable