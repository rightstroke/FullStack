import { TestBed } from '@angular/core/testing';

import { UtilityService } from './utility.service';
import { SecurityContext } from '@angular/core';
import { of } from 'rxjs';

describe('UtilityService', () => {
  let service: UtilityService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UtilityService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  //Start


  describe('all', () => {


    it('test case 1', () => {
      const userresponse = [
        {
          id: "1",
          name: "Abcd",
          role: "developer",
          tech: "java"
        },
        {
          id: "2",
          name: "XYZ",
          role: "Sr developer",
          tech: "java"
        },
        {
          id: "3",
          name: "1234",
          role: "architect",
          tech: "fullstack"
        },
        {
          id: "4",
          name: "asdf",
          role: "tester",
          tech: "selenium123"
        },
      ];

      let response;

      spyOn(service, 'all').and.returnValue(of(userresponse));

      service.all().subscribe(res => {
        response = res;
      })

      expect(response).toEqual(userresponse);

    });

    it('test case 2-without spyon..', () => {
      const userresponse = [
        {
          id: "1",
          name: "Abcd",
          role: "developer",
          tech: "java"
        },
        {
          id: "2",
          name: "XYZ",
          role: "Sr developer",
          tech: "java"
        },
        {
          id: "3",
          name: "1234",
          role: "architect",
          tech: "fullstack"
        },
        {
          id: "4",
          name: "asdf",
          role: "tester",
          tech: "selenium"
        },
      ];

      let response;

      service.all().subscribe(res => {
        response = res;
      })

      expect(response).toEqual(userresponse);
    });

    it('test case 3', () => {
      const userresponse = [
        {
          id: "2",
          name: "XYZ",
          role: "Sr developer",
          tech: "java"
        }
      ];

      let response;

      service.findone("2").subscribe(res => {
        response = res;
      })
      console.log(response);
      console.log(userresponse);
      expect(response).toEqual(userresponse[0]);
    });

    it ('all()2 test case', () => {
      const userresponse = [
        {
          id: "2",
          name: "XYZ",
          role: "Sr developer",
          tech: "java"
        }
      ];

      let response;

      spyOn(service, 'all2').and.returnValue(of(userresponse));

      service.all2().subscribe(res => {
        response = res;
      })

      expect(response).toEqual(userresponse);
    });

    it('test addnumbers funtions',()=>{
      let result = service.addnumbers(1,2);
      expect(result).toEqual(53);
    })

    it('test addnumbers funtions > 20',()=>{
      let result = service.addnumbers(22,2);
      expect(result).toEqual(44);
    })


  });


});

  //Emd


//});
