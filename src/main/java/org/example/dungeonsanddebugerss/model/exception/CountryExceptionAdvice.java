package org.example.dungeonsanddebugerss.model.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.example.dungeonsanddebugerss.exception.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CountryExceptionAdvice {

    @ExceptionHandler(CountryNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<org.example.dungeonsanddebugerss.exception.Response> countryNotfoundHandler(CountryNotFoundException e, HttpServletRequest request) {
        org.example.dungeonsanddebugerss.exception.Response response = new Response(request.getRequestURL().toString(), 400, e.getMessage());
        return ResponseEntity.badRequest().body(response);
    }

}