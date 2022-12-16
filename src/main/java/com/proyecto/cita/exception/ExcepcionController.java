package com.proyecto.cita.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExcepcionController {


    @ExceptionHandler(value = {BadParameterException.class})
    public ResponseEntity<Object> hendleBadParameterException(BadParameterException e, HttpServletRequest httpServletRequest){

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(e.getErrorMessage());
    }
}
