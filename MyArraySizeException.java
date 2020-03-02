package lesson2;

public class MyArraySizeException extends SpecialException {
    public MyArraySizeException() {
        super("Данный массив не 4x4 !!!");
        System.out.println("Данный массив не 4x4 !!!");
    }
}
