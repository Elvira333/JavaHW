package org.example;

public class MyArraySizeException extends  ArrayException{

    public MyArraySizeException(String message, String[][] array) {
        super(message, array, rows, columns);
    }
}
