import { HTTP_INTERCEPTORS } from "@angular/common/http";
import { LoggingInterceptor } from "./logging-interceptor";
import { ResponseInterceptor } from "./http-interceptors";
import { CachingInterceptor } from "./cache-interceptors";

/** Http interceptor providers in outside-in order */

export const HttpInterceptorProviders = [
  { provide: HTTP_INTERCEPTORS, useClass: LoggingInterceptor, multi: true },
  { provide: HTTP_INTERCEPTORS, useClass: ResponseInterceptor, multi: true },
  { provide: HTTP_INTERCEPTORS, useClass: CachingInterceptor, multi: true }
];
