package com.cpp.bibleuniversity.demo.Exceptions;

import com.cpp.bibleuniversity.demo.Exceptions.Exception.DatabaseNotFoundException;
import com.cpp.bibleuniversity.demo.Exceptions.Exception.DuplicateAccountException;
import com.cpp.bibleuniversity.demo.Exceptions.Response.DatabaseNotFoundExceptionResponse;
import com.cpp.bibleuniversity.demo.Exceptions.Response.DuplicateAccountResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<Object> handleDuplicateAccountException(DuplicateAccountException ex, WebRequest request) {
        DuplicateAccountResponse response = new DuplicateAccountResponse(ex.getMessage());
        return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public final ResponseEntity<Object> handleDatabaseNotFoundException(DatabaseNotFoundException ex, WebRequest request) {
        DatabaseNotFoundExceptionResponse response = new DatabaseNotFoundExceptionResponse(ex.getMessage());
        return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
    }

}
