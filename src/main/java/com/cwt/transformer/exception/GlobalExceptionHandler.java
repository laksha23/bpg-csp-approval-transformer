package com.cwt.transformer.exception;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NoSuchBeanDefinitionException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    protected String handleNotOnBoardedTripApprovalClients(RuntimeException ex){
        return ex.getMessage().split(" ")[3]+" not yet onboarded for Trip Approval";
    }
}
