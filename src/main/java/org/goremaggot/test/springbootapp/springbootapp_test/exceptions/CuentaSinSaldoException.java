package org.goremaggot.test.springbootapp.springbootapp_test.exceptions;

public class CuentaSinSaldoException extends RuntimeException {
    public CuentaSinSaldoException(String message) {
        super(message);
    }
}
