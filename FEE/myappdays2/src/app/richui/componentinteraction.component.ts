import { Component,Directive, forwardRef, Attribute,OnChanges, SimpleChanges,Input,OnInit } from '@angular/core';
import { NG_VALIDATORS,Validator,Validators,AbstractControl,ValidatorFn } from '@angular/forms';


@Component({
  selector: 'bootstraoform',
  templateUrl: './componentinteraction.component.html',
  styleUrls: [ './componenti.component.css' ]
})
export class ComponentInteractionComponent   {

    newHero() {
    // this.model = new User('','');
    }

}
