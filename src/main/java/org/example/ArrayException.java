package org.example;

public abstract class ArrayException extends Exception {
    private String[][] array;

    private int rows;

    private int columns;

    public String[][] getArray() {
        return array;
    }

    public ArrayException(String message, String[][] array, int rows, int columns) {
        super(message);
        this.array = array;
        this.rows = rows;
        this.columns = columns;
    }
}
