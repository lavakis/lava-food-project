package com.lava.validException;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ValidExceptionHandler {
@ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleValidException(MethodArgumentNotValidException ex){
    Map<String, String> errorMap = new HashMap<>();
    BindingResult bindingResult=ex.getBindingResult();

    if (bindingResult.hasErrors()){
       for (FieldError fieldError :bindingResult.getFieldErrors()){
           errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
       }
    }
    return  errorMap;
}
    }

