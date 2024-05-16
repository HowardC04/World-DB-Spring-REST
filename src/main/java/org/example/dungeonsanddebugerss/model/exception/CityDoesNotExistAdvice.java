package org.example.dungeonsanddebugerss.model.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CityDoesNotExistAdvice {

    @ResponseBody
    @ExceptionHandler(CityDoesNotExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Response> cityDoesNotExistHandler(CityDoesNotExistException e, HttpServletRequest request){

        Response response = new Response(e.getMessage(), 400, request.getRequestURI());
        return ResponseEntity.badRequest().body(response);
    }
}
