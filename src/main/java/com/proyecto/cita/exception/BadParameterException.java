package com.proyecto.cita.exception;


public class BadParameterException extends RuntimeException{

    private String errorMessage;

    public BadParameterException(){}

    public BadParameterException(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
