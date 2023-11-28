package de.neuefische.springexceptionhandlingtask.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;


@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {AnimalNotFoundException.class})
    public ResponseEntity<Object> handleAnimalNotFoundException(AnimalNotFoundException e) {
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {CarBrandNotAllowedException.class})
    public ResponseEntity<Object> handleCarBrandNotAllowedException(CarBrandNotAllowedException e) {
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {NoAnimalsAvailableException.class})
    public ResponseEntity<Object> handleNoAnimalsAvailableException(NoAnimalsAvailableException ex) {
        ApiException apiException = new ApiException(
                ex.getMessage(),
                ex,
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {NoCarsAvailableException.class})
    public ResponseEntity<Object> handleNoCarsAvailableException(NoCarsAvailableException ex) {
        ApiException apiException = new ApiException(
                ex.getMessage(),
                ex,
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
    }


}
