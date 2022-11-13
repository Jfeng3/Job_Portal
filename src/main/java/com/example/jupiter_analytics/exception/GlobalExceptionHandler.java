package com.example.jupiter_analytics.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private final MessageSource messageSource;

    public GlobalExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler({GlobalException.class})
    protected ResponseEntity handleGlobalException(GlobalException e) {
        return ResponseEntity.badRequest().body(e.getCode() + ":" + e.getMessage());
    }
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request){
        ErrorModel error=new ErrorModel(HttpStatus.BAD_REQUEST,"Validation Error",ex.getBindingResult().toString());
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
    /*
    @ExceptionHandler({Exception.class})
    protected ResponseEntity handleException(Exception e) {
        return ResponseEntity.badRequest().body("Exception occurred inside API " + e.getMessage());
    }
    */

}
