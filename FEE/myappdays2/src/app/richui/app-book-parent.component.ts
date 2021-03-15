import { Component } from '@angular/core';
import { BOOKS } from './book';

@Component({
    selector: 'app-book-parent',
    template: `
      <h2>{{master}} controls {{books.length}} Books</h2>
      <app-book-child *ngFor="let book of books"
        [book]="book"
        [master]="master">
      </app-book-child>
    `
})

export class AppBookParentComponent {
  books =  BOOKS;
  master = 'Master';
}
