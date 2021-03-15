import { Component, Input  } from '@angular/core';
import { Book } from './book';

@Component({
    selector: 'app-book-child',
    template: `
      <h3>{{book.isbn}} says:</h3>
      <p>I, {{book.title}},- {{book.author}} am at your service, {{masterName}}.</p>
    `
})

export class AppBookChildComponent {
  @Input() book: Book;
  @Input('master') masterName: string;
}
