package com.example.jupiter_analytics.exception;

public class UserNotFoundException extends GlobalException{
    public UserNotFoundException(String message,Long code){
        super(message,code);
    }
}
