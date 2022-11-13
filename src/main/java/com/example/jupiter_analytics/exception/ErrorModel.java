package com.example.jupiter_analytics.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorModel {
    private HttpStatus httpStatus;
    private LocalDateTime timestamp;
    private String message;
    private String details;

    public ErrorModel(HttpStatus httpStatus,String message, String details) {
        this.httpStatus = httpStatus;
        this.timestamp = LocalDateTime.now();
        this.message = message;
        this.details = details;
    }

    @Override
    public String toString() {
        return "ErrorModel{" +
                "httpStatus=" + httpStatus +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
