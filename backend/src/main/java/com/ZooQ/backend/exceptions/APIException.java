package com.ZooQ.backend.exceptions;

public class APIException extends RuntimeException {

    public APIException() {
    }

    public APIException(String message) {
        super(message);
    }
}