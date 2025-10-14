package com.vasiliskardaras.soap_client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.ws.soap.client.SoapFaultClientException;

import java.time.OffsetDateTime;
import java.time.ZoneId;

@RestControllerAdvice
public class CustomExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(SoapFaultClientException.class)
    public ResponseEntity<ErrorResponseModel> handleConstraintViolationException(SoapFaultClientException e) {
        LOGGER.error("{}", e.getMessage(), e);
        var error = new ErrorResponseModel(e.getMessage(), OffsetDateTime.now(ZoneId.of("Europe/Athens")));
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
