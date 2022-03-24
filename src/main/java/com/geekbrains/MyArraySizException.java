package com.geekbrains;

public class MyArraySizException extends Exception{
    public MyArraySizException() {
        super("Массив должен быть размером 4Х4");
    }
}