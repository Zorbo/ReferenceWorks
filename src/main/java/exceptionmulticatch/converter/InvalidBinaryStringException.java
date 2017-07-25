package exceptionmulticatch.converter;

/**
 * Created by Training on 2017. 03. 30..
 */
public class InvalidBinaryStringException extends RuntimeException {


    public InvalidBinaryStringException(String message, Throwable cause) {
        super(message, cause);
    }

}
