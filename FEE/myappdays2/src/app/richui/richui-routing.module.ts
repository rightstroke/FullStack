import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";

import { BootStrapformComponent } from "./bootstrapform.component";
import { ComponentInteractionComponent } from "./componentinteraction.component";
import { BooksViewComponent } from "./booksview.component";
import { EmitViewComponent } from "./emitview.component";

const richuiValRoutes: Routes = [
  { path: "mybootstrap", component: BootStrapformComponent },
  { path: "component-interaction", component: ComponentInteractionComponent },
  { path: "books-view", component: BooksViewComponent },
  { path: "emit-catch", component: EmitViewComponent }
];

@NgModule({
  imports: [RouterModule.forChild(richuiValRoutes)],
  exports: [RouterModule]
})
export class RichUInRoutingModule {}
