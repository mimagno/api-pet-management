package com.api.pet.management.application.core.exception;

import java.io.Serializable;

public class CustomException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public CustomException() {
        super();
    }

    public CustomException(String message, Exception e) {
        super(message, e);
    }

    public CustomException(String message) {
        super(message);
    }
}
