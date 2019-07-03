package com.app.controller;



public class ExceptionHandlineInfo {

	

/**
 *  This is to about handle exception at run time . when any sudden exception occur that could be inconvenient to user and not understandable.
 * 
 *  To overcome this problem Spring provide exception handing in three ways --- 
 *  		 	1. Controller based Exception handing 	---  i.e.  Handing exception for that controller only.
 *  			2. Global Exception Handing				---   handling exception for all controllers
 *  			3. User Defined Exception Handling      ---  handling exception created by user
 * 
 * 
 * 		````**  We use @ExceptionHander(value=Exception_name.class)  on method level
 * 		````**  Use  @ControllerAdvice  on controller for exception controller
 *  
 * 	1. Controller Based Exception Handling --> 
 * 												Create a method and apply @ExceptionHander(value=exception_name.class)  then all that kind of
 * 												occur in that controller will be handled by that method.
 * 											    -- We need to create one method for each exception
 * 
 * 	2. Global Exception Handling   -->
 * 										Create a controller apply @Controller &  @ControllerAdvice . Create  methods for handling exception
 * 										and apply apply @ExceptionHander(value=exception_name.class)  , then all this kind of exception
 * 										occurring in all controllers will be handled by this method
 * 										-- Then no need to handling same exception at controller & global level , if same then controller based first then global
 *  
 *  3. UserDefined Exception -->  
 *  							Create one exception by extending RunTimeException . Throw this exception when ever chances or exception
 *  							Write exceptionHandler method in exception controller and send appropriate message to user
 * 
 * 
 *```````````````````````  using same process we can do exception handling in rest service also `````
 *			
 *			**  if both RestExceptionController & ExceptionController will have same exceptions then ExceptionController will excecute first
 * 
 * 
 * */


	
	
	
}
