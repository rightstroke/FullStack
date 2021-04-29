let aPerson = {
    name : "MurattuKaalai"
};

let abce = aPerson;

abce.name = "baba";
console.log(abce);
console.log(aPerson);
console.log("=========================");

let shollowCopy = {
    ...aPerson
}
shollowCopy.name = "Kalaiyaan";

console.log(abce);
console.log(aPerson);
console.log(shollowCopy);