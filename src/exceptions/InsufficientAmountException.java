package exceptions;

public class InsufficientAmountException extends Exception{
    public InsufficientAmountException() {
    }
    public InsufficientAmountException(String message) {
        super(message);
    }
}
