package lesson2;

/**
1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
 при подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
 текст вместо числа), должно быть брошено исключение MyArrayDataException – с детализацией,
 в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException
 и MyArrayDataException и вывести результат расчета.
 */

public class HW2 {
    public static void main(String[] args) {
        String[][] arr = {
                {"8", "4", "5", "3"},
                {"1", "4", "7", "7"},
                {"5", "5", "5", "2"},
                {"0", "8", "7", "0"}
        };
        String[][] arr2 = {
                {"9", "6", "3", "8"},
                {"5", "1", "4", "7"},
                {"4", "2", "0"},
                {"9", "3", "7", "3"}
        };


        String[][] arr3 = {
                {"4", "8", "2", "3"},
                {"6", "1", "9", "3"},
                {"5", "9", "9", "4"},
                {"a", "1", "7", "6"}
        };


        try {
            System.out.println(Rules.strRules(arr));
        } catch (SpecialException e) {
            e.printStackTrace();
        }


        try {
            System.out.println(Rules.strRules(arr3));
        } catch (SpecialException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(Rules.strRules(arr2));
        } catch (SpecialException e) {
            e.printStackTrace();
        }



    }

}
