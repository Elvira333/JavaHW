package org.example;

public abstract class ArrayException extends Exception {
    private String[][] array;

    public String[][] getArray() {
        return array;
    }

    public ArrayException(String message, String[][] array, int rows, int columns) {
        super(message);
        this.array = array;
    }
}
