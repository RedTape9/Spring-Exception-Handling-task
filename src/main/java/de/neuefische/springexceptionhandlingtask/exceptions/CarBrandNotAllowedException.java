package de.neuefische.springexceptionhandlingtask.exceptions;

public class CarBrandNotAllowedException extends RuntimeException {

    public CarBrandNotAllowedException(String message) {
        super(message);
    }
}