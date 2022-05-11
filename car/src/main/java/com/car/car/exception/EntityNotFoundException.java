package com.car.car.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Entity not found in db")
public class EntityNotFoundException extends Exception{

    public EntityNotFoundException(String message){
        super(message);
    }

}
