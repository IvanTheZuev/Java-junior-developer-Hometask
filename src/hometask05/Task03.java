package hometask05;

import java.util.Scanner;
import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        //Задача №3
        //Заполните массив на `len` элементов (размер массива вводит пользователь) случайным целыми числами и выведете
        //максимальное, минимальное и среднее арифметическое значение элементов массива.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива!");

        int len = scanner.nextInt();
        int[] array = new int[len];
        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
        max = array[0];
        for (int i = 1; i < array.length ; i++) {
            int number = array[i];
            if (number > max) {
                max = number;
            }
        }
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            int number1 = array[i];
            if (number1 < min){
                min = number1;
            }
        }
        System.out.println("Минимальное число " + min + "\n" + "Максимальное число " + max);

    }
}

