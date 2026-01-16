package br.com.exerciciopaypal.model.exception;

public class ModelExcepiton extends RuntimeException {
    public ModelExcepiton(String message) {
        super(message);
    }

    private static final long serialVersionUID = 1L;

    public ModelExcepiton(String message, Throwable cause) {
        super(message, cause);
    }
    public ModelExcepiton(Throwable cause) {
        super(cause);
    }
    public ModelExcepiton() {
    }

}
