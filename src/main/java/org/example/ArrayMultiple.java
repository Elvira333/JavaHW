package org.example;

public abstract class ArrayMultiple {
    protected String[][] array;

    public ArrayMultiple(String[][] array) {
        this.array = array;
    }

    /**
     * Метод проверяте размерность массива и выбрасывает исключение при неподходящем
     * @param array
     * @throws MyArraySizeException
     */
    void size(String[][] array) throws MyArraySizeException{
        int rows = array.length;
        int columns = array[0].length;
      if(rows!=4 && columns!=4){
          throw new MyArraySizeException("Массив не является размером 4x4!",array,rows,columns);
      }
      else this.array = array;
    };

    void data(String[][] array,int rows,int columns) throws MyArrayDataException{
        int[][] arr = new int[array.length][array[0].length];

        for(int i =0;i< array.length;i++){
            for(int j = 0; j<array[0].length;j++){
                if(tryParseInt(array,i,j)){
                    arr[i][j] = Integer.parseInt(array[i][j]);
                }
                else throw new MyArrayDataException("Неудачная конвертация",array,i,j);
            }
        }

    }
    public static boolean tryParseInt(String[][] arr,int rows, int columns) {
        try {
            Integer.parseInt(arr[rows][columns]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
