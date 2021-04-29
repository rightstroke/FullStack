class Animal {
    constructor(h,w){
        this.height = h;
        this.weight = w;
    }

    doSomething() {
        return this.height * this.weight;
    }
}

let someClass = class {
    constructor(h,w){
        this.height = h;
        this.weight = w;
    }

    doSomething() {
        return this.height + this.weight;
    }
}

let animal = new Animal(12,34);
let result = animal.doSomething();
console.log(result);

let animal2 = new someClass(12,34);
let result2 = animal2.doSomething();
console.log(result2);
