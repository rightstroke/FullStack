package com.rsc.dlvery.api;

import java.util.Calendar;

import com.rsc.dlvery.exception.DeliveryException;
import com.rsc.dlvery.model.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController  extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(value={RuntimeException.class})
    public ResponseEntity<ErrorResponse> handleRTEException(RuntimeException ex, WebRequest req){
        
        ErrorResponse errRes = new ErrorResponse();
        errRes.setCode(500);
        errRes.setMessage("System Error has Occured, Please Try after some time,Ref id-" + Math.random()*1000);
        errRes.setTs(Calendar.getInstance());
        
        ex.printStackTrace();
        return new ResponseEntity<ErrorResponse>(errRes,HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(value={Exception.class})
    public ResponseEntity<ErrorResponse> handleGeneralException(Exception ex, WebRequest req){
        
        ErrorResponse errRes = new ErrorResponse();
        errRes.setCode(500);
        errRes.setMessage(ex.getMessage() + Math.random()*1000);
        errRes.setTs(Calendar.getInstance());
        
        ex.printStackTrace();
        return new ResponseEntity<ErrorResponse>(errRes,HttpStatus.BAD_GATEWAY);
    }


    @ExceptionHandler(value={DeliveryException.class})
    public ResponseEntity<ErrorResponse> handleDeliveryException(DeliveryException ex, WebRequest req){
        
        ErrorResponse errRes = new ErrorResponse();
        errRes.setCode(500);
        errRes.setMessage(ex.toString());
        errRes.setTs(Calendar.getInstance());
        
        ex.printStackTrace();
        return new ResponseEntity<ErrorResponse>(errRes,HttpStatus.BAD_GATEWAY);
    }
}
