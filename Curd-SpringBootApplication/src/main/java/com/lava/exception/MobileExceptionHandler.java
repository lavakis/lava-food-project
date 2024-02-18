package com.lava.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class MobileExceptionHandler {
	@ExceptionHandler(value= {MobileNotFoundException.class})
	public ResponseEntity<Object> handleMobileNotFoundException 
(MobileNotFoundException mobilenotfound)
{
	Mobileexception mobileexception =new Mobileexception(
			mobilenotfound.getMessage(),
			mobilenotfound.getCause(),
			HttpStatus.NOT_FOUND
			);
	return new ResponseEntity<>(mobileexception,HttpStatus.NOT_FOUND);
	
}
}
