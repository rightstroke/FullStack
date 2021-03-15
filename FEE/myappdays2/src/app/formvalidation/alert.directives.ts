import { Directive, ElementRef, Renderer2, OnInit, HostBinding, Input, HostListener } from '@angular/core';

@Directive({
    selector:'[appAlert]'
})
export class AlertDirective implements OnInit {
    
    divElement:any;
    spanElement:any;
    spanText:any;

    @HostBinding("title")
    title:string

    @Input("error")
    error1:string;

    constructor(private elementRef:ElementRef,private renderer:Renderer2){
        elementRef.nativeElement.style.background='lightblue';
    }

    ngOnInit(): void {
        const div = this.renderer.createElement('div'); //<div></div>
        const text = this.renderer.createText(this.error1);  
        this.renderer.addClass(div,'divr'); //<div class="divr"></div>
        this.renderer.appendChild(div,text);//<div class="divr">Message here</div>
        this.renderer.appendChild(this.elementRef.nativeElement,div);
        this.title = "Please Try Again";
        
        const p= this.renderer.createElement("p");
        const text2 = this.renderer.createText(this.title);
        this.renderer.addClass(p,'divbv');
        this.renderer.appendChild(p,text2);
        this.renderer.appendChild(this.elementRef.nativeElement,p);
    }

    @HostListener("mouseenter",["event"])
    onMouseEnter(event) {
        console.log(event);
        this.renderer.setStyle(this.elementRef.nativeElement,"transform","scale(1.1)");
        this.hightight("yellow");
    }

    @HostListener("mouseleave",["event"])
    onMouseLeave(event) {
        console.log(event);
        this.renderer.setStyle(this.elementRef.nativeElement,"transform","scale(1)");
        this.hightight("lightblue");
    }

    private hightight(color:string){
        this.elementRef.nativeElement.style.backgroundColor = color;
    }


}