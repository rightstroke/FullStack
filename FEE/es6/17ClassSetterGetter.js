class Student {
    constructor(rno,fname,lname){
       this.rno = rno
       this.fname = fname
       this.lname = lname
       console.log('inside constructor')
    };
    set rollno(newRollno){
       console.log("inside setter")
       this.rno = newRollno
    };

    get fullName(){
        console.log('inside getter')
        return this.fname + " - "+this.lname
     }
 }
 let s1 = new Student(101,'Sachin','Tendulkar');
 console.log(s1);
 //setter is called
 s1.rollno = 201;
 console.log(s1.fullName)
 console.log(s1);