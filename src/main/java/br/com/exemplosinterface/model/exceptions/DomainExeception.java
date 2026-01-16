package br.com.exemplosinterface.model.exceptions;

public class DomainExeception extends RuntimeException {
    public DomainExeception(String message) {
        super(message);
    }
}
