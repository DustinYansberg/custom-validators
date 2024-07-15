package com.custom_validator.exception_handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 * RestControllerAdvice is used to handle exceptions globally
 * in spring boot applications. it allows us to apply exception
 * handling across all '@RestController' annotated classes
 */
@RestControllerAdvice
public class ApplicationExceptionHandler {

    /*
     * this annotation specifies that our method will handle
     * 'MethodArgumentNotValidException' exceptions. this exception is thrown when a
     * method argument fails validation (e.g. due to a '@Valid' or '@Validated'
     * annotation in the RestController)
     */
    /*
     * this annotation ensure that the response status is set to 400 BAD_REQEUST
     * when a MethodArgumentValidationException exception is handled. This indicates
     * to the client that there was a validation error in the request
     */
    /*
     * - this method takes a MethodArgumentValidationException as a parameter. which
     * contains details about the validation errors.
     *
     * - it creates a string map to store the validation errors
     *
     * - the method iterates over the fields errors from the exception, adding each
     * field and its corresponding default message to the map
     *
     * - finally it returns the map containing the error messages.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleMethodArgumentException(MethodArgumentNotValidException exception) {
	Map<String, String> errorMap = new HashMap<>();
	exception.getBindingResult().getFieldErrors().forEach(error -> {
	    errorMap.put(error.getField(), error.getDefaultMessage());
	});

	return errorMap;
    }

}
