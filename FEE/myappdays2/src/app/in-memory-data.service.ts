import { InMemoryDbService } from 'angular-in-memory-web-api';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const users = [
      { id: 'abcd', userid:'abcd', password: 'abcd123' },
      { id: 'xyz', userid:'xyz', password: 'xyz123' }
    ];

    const formmenu = [
      { id: '1', name:'SimpleForm', url: '/simpleform' }
    ];

    const books = [
        {isbn: "isbn1234567890",title :"Book on Angular",author : "Area51"},
        {isbn: "isbn1234567888",title :"Book on Nodejsr",author : "Kailash"},
        {isbn: "isbn1234567899",title :"Book on JakartaEE",author : "Sicara Bird"},
        {isbn: "isbn1234567897",title :"Chariots of the God",author : "AncientAliens"}
      ];


    return {users,formmenu,books};
  }
}
