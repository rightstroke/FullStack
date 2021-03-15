import { Component } from '@angular/core';

@Component({
    selector:'app-directives',
    templateUrl:"./directives.component.html",
    styleUrls:["./directives.component.css"]
})
export class DirectivesComponent {

    public t:string="===========";

    public items = [
        {id:1,name:'Apple',type:'Fruit'},
        {id:1,name:'Potato',type:'Vegetables'},
        {id:1,name:'Rice',type:'Grocerries'}
    ];

    public showDiv:boolean=true;

    public loginError:string = "Customer Error Message";

    public getBgColor(type:any):string{
        if (type === "Fruit"){
            return "lightblue";
        } else {
            return "grey";
        }
    }

    public toggleDiv(){
        this.showDiv = !this.showDiv;
    }

}