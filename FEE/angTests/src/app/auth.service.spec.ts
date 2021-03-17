import { TestBed } from '@angular/core/testing';

import { AuthService } from './auth.service';

describe('AuthService', () => {
  let service: AuthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthService);
  });

  afterEach(()=>{
    localStorage.removeItem('token');
  })

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should return true from isAuthenticated when there is a token', () => {
    localStorage.setItem('token','1234');
    console.log("service.isAuthenticated().." + service.isAuthenticated())
    expect(service.isAuthenticated()).toBeTruthy();
  });

  it('should return false from isAuthenticated when there is a token', () => {
    console.log("service.isAuthenticated() when no token.." + service.isAuthenticated())
        expect(service.isAuthenticated()).toBeFalsy();
  });

});
