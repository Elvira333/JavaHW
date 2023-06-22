package org.example;

public class MyArrayDataException extends ArrayException{

    public MyArrayDataException(String message, String[][] array, int rows, int columns) {
        super(message, array,rows,columns);
    }
}
