package com.geekbrains;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        super("В ячейке массива (" + (i+1) + ", " + (j+1) + ") находится не цифра.");
    }
}