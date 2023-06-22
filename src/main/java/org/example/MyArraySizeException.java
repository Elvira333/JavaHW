package org.example;

public class MyArraySizeException extends  ArrayException{

    public MyArraySizeException(String message, String[][] array, int rows,int columns) {
        super(message, array, rows, columns);
    }
}
