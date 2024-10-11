package org.example;
import org.example.exceptions.MyArrayDataException;
import org.example.exceptions.MyArraySizeException;

public class Main {

    public static void main(String[] args) {

        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArraySize = {
                {"1", "2"},
                {"3", "4"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "three", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArray(validArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            int result = sumArray(invalidArraySize);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            int result = sumArray(invalidDataArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
    }


    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4.");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        return sum;
    }

}