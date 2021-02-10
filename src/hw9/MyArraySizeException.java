package hw9;

public class MyArraySizeException extends Throwable {
    public MyArraySizeException() {
        super("Вы ввели масиив неправильного размера. Массив должен быть размером 4х4");
    }

}
