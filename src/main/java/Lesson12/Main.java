package Lesson12;

public class Main {


    public static void main(String[] args) {
        String[][] strings = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        String[][] strings1 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "19", "20"}};
        String[][] strings2 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "кот", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "19", "20"}};

        read(strings);
        try {
            if (strings1.length <= 4) {
                read(strings1);
            }
            throw new MyArraySizeException("Данный массив большего размера");
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            read(strings2);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("В массиве не корректные символы" + e);
        }


    }

    static int numArr[][] = new int[4][4];
    static int sum = 0;

    public static void read(String[][] arrayString) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[i].length; j++) {
                int temp = Integer.parseInt(arrayString[j][i]);
                numArr[j][i] = temp;
                sum = sum + temp;

            }
            System.out.println();
        }
        System.out.println(sum + " Сумма чисел в массиве");
    }

}
