package hw9;

public class MyArrayDataException extends Throwable {

    public MyArrayDataException(String message,Throwable cause) {
        super("В массиве элемент "+message+ " не является строкой",cause);
    }
}
