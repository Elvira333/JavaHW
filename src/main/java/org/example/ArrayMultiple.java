package org.example;

public class ArrayMultiple {

    public String[][] array;

    public ArrayMultiple() {
        this.array = array;
    }


    /**
     * Метод проверяте размерность массива и выбрасывает исключение при неподходящем
     *
     * @param array
     * @param rows
     * @param columns
     * @throws MyArraySizeException
     */
    void size(String[][] array, int rows, int columns) throws MyArraySizeException{
      if(rows!=4 && columns!=4){
          throw new MyArraySizeException("Массив не является размером 4x4!",array,rows,columns);
      }
      else this.array = array;
    };

    void data(String[][] array,int rows,int columns) throws MyArrayDataException{
        int[][] arr = new int[rows][columns];

        for(int i =0;i< rows;i++){
            for(int j = 0; j < columns;j++){
                if(tryParseInt(array, i, j)){
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
