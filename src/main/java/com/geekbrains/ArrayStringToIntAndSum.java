package com.geekbrains;

public class ArrayStringToIntAndSum {
    public static void main(String[] args) {
        String[][] array = {{"2", "g", "3", "3" }, {"4", "2", "3", "3" }, {"4", "2", "3", "3" }, {"4", "2", "3", "3" }};
        try {
            stringToInt(array);
        } catch (MyArrayDataException | MyArraySizException e) {
            System.out.println(e.getMessage());

        }

    }


    public static void stringToInt(String[][] array) throws MyArraySizException {
        checkSizeOfArray(array);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(sum);
    }

    public static void checkSizeOfArray(String[][] array) throws MyArraySizException {
        if ((array.length != 4) || (array[0].length != 4))
            throw new MyArraySizException();


    }


}
