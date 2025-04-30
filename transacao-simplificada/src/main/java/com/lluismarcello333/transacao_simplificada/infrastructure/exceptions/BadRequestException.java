package com.lluismarcello333.transacao_simplificada.infrastructure.exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
