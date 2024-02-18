package com.lava.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static ResponseEntity<Object>responseBuilder(
			String message,String message1, HttpStatus httpStatus,Object responseObject
			)
	{
		Map<String,Object> response=new HashMap<>();
		response.put("message", message1);
		response.put("httpStatus", httpStatus);
		response.put("data", responseObject);
		return new ResponseEntity<>(response,httpStatus);
	}
	
}
