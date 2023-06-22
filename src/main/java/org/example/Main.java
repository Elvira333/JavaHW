package org.example;

import java.util.Random;

public class Main {
    //        Задача 1:
//
//        1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
//        подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//        просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//                ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//        MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//        3 В методе main() вызвать полученный метод, обработать возможные исключения
//        MyArraySizeException и MyArrayDataException и вывести результат расчета.
//
    public static void main(String[] args) {

        Random rand = new Random();
        int rows = rand.nextInt(10);
        int columns = rand.nextInt(10);
        String[][] arr = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = String.valueOf(rand.nextInt(100));
            }
        }
        ArrayMultiple test = new ArrayMultiple();

            try {
                    test.size(arr,rows,columns);
                    test.data(arr,rows, columns);
                System.out.println("Всё прошло успешно!");

            }
            catch (MyArraySizeException e){
                System.out.printf("Ошибка при попытке обработать массив, так как размер %d строк, %d столбцов \n%s\n",
                        e.getRows(),e.getColumns(), e.getMessage());
            }
            catch (MyArrayDataException e){
                System.out.printf("Ошибка при конвертировании значений, в строке № %d, в столбце № %d\n%s\n",
                        e.getRows(),e.getColumns(), e.getMessage());
            }


    }
}