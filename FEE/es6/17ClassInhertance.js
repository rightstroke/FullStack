'use strict'
class Shape {
    myname = "";
    constructor(a) {
        this.Area = a
        this.myname = "superstar";
    }

    doCalculatePerimeter() {
        console.log("=========Parent Perimeter method..");
    }

}
class Circle extends Shape {
    disp() {
        //console.log("Area of the circle:  "+this.Area + "," + this.myname);
        console.log(`Area of the circle:   ${this.Area} , ${this.myname}`);
    }

    doCalculatePerimeter() {
        super.doCalculatePerimeter();
        console.log("=========Child Perimeter method..");
    }
}
var obj = new Circle(223);
obj.disp() 
obj.doCalculatePerimeter();