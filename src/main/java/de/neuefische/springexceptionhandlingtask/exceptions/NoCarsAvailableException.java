package de.neuefische.springexceptionhandlingtask.exceptions;

public class NoCarsAvailableException extends RuntimeException {

    public NoCarsAvailableException(String message) {
        super(message);
    }
}