import { Component,Directive, forwardRef, Attribute,OnChanges, SimpleChanges,Input,OnInit } from '@angular/core';
import { NG_VALIDATORS,Validator,Validators,AbstractControl,ValidatorFn } from '@angular/forms';


@Component({
  selector: 'bootstraoform',
  templateUrl: './bootstrapform.component.html',
  styleUrls: [ './bootstrapform.component.css' ]
})
export class BootStrapformComponent   {

    newHero() {
    // this.model = new User('','');
    }

}
