package util;

public class OperationNotFoundException extends RuntimeException {
    OperationNotFoundException (String operation){
        super("Could not find Fibonachi number ");
    }
}
