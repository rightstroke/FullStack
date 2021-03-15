import { Component, OnInit } from "@angular/core";

import { Book } from "./book";
import { BooksService } from "./books.service";

@Component({
  selector: "my-interceptor",
  templateUrl: "./books.component.html",
  providers: [BooksService],
  styleUrls: ["./books.component.css"]
})
export class BooksViewComponent implements OnInit {
  books: Book[];

  publisher: String;

  constructor(private booksService: BooksService) {}

  ngOnInit() {
    this.getBooks();
  }

  getBooks(): void {
    this.booksService.getBooks().subscribe(books => (this.books = books));
  }

  getUnknownUrl(): void {
    this.booksService.getUnknownUrl().subscribe(books => (this.books = books));
  }
}
