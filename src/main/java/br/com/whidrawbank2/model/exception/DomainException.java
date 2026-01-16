package br.com.whidrawbank2.model.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }

    private static final long serialVersionUID = 1L;

    public static final String ERROR_LIMIT = "Withdraw error: the amount exceeds withdraw limit";

    public static final String ERROR_BALANCE = "Withdraw error: not enough balance";

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }


    public DomainException(Throwable cause) {
        super(cause);
    }

    public DomainException() {

    }
}
