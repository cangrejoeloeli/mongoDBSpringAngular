import { HttpInterceptorFn, HttpRequest } from '@angular/common/http';

import { environment } from '../../environments/environment.development';

export const apiUrlInterceptor: HttpInterceptorFn = (req, next) => {

  /** clono el req para agragar el apiUrl según entorno */
  const reqnew = req.clone(
    {
      url: environment.apiUrl + req.url
    }
  )

  return next(reqnew);


};
