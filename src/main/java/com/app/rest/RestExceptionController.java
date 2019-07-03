package com.app.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.exception.NoBookFoundException;
import com.app.model.ApiError;


@RestController
@RestControllerAdvice
public class RestExceptionController {

	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Model map) {  // we can use string also as response  or responseEntity
		
	//	map.addAttribute("error","Some Problem occur  , please try after some time, From exception controller");
		
		return "Some Porblem occur  , please try after some time, From rest exception controller";
	}

	
	// handling ArithmeticException
	@ExceptionHandler(value=ArithmeticException.class) 
	public ResponseEntity<String> handleArithmeticException(Model map) {
		
		ResponseEntity<String> res=null;
		
		res = new ResponseEntity<String>("Arithmetic error occur , from  rest exception controller",HttpStatus.BAD_REQUEST);
				
		return res;
	}
	
	
	// handling userDefined Exception sending generating api message
	@ExceptionHandler(value=NoBookFoundException.class)
	public  ResponseEntity<ApiError> handleNoBookFoundException(Model map) {

		ResponseEntity<ApiError> res=null;

		ApiError error = new ApiError(400,"No Book Found", new Date());
		
		res = new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);

		return res;
	}


}
