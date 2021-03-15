import { Component,Directive, forwardRef, Attribute,OnChanges, SimpleChanges,Input,OnInit } from '@angular/core';
import { NG_VALIDATORS,Validator,Validators,AbstractControl,ValidatorFn } from '@angular/forms';
import { Form1 }    from '../uimodel/formmodel';


@Component({
  selector: 'simpleform',
  templateUrl: './simpleform.component.html',
  styleUrls: [ './simpleform.component.css' ]
})
export class SimpleformComponent   {

    powers = ['Really Smart', 'Super Flexible',
              'Super Hot', 'Weather Changer'];
    model = new Form1('','',null,'','','');
    submitted = false;
    onSubmit() {
      this.submitted = true;
    }

    newHero() {
    // this.model = new User('','');
    }

}
