package de.neuefische.springexceptionhandlingtask.exceptions;

public class NoAnimalsAvailableException extends RuntimeException {

    public NoAnimalsAvailableException(String message) {
        super(message);
    }
}