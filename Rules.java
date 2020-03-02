package lesson2;

public class Rules {

    public static int strRules(String[][] strArray)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != strArray.length) throw new MyArraySizeException();
        for (int i = 0; i < strArray.length; i++) {
            if (4 != strArray[i].length) throw new MyArraySizeException();
            for (int q = 0; q < strArray[i].length; q++) {

                try {
                    sum += Integer.parseInt(strArray[i][q]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, q);
                }
            }
        }
        return sum;
    }
}
