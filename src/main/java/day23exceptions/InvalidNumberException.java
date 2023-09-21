package day23exceptions;
public class InvalidNumberException extends RuntimeException{
    public InvalidNumberException(String message) {
        super(message);
    }
}