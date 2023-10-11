package hometask05;

import java.util.Scanner;
import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        //Создать два массива целых чисел на 5 элементов каждый.
        //Массивы необходимо заполнять значениями в цикле. Значения вводит пользователь с клавиатуры.
        //Если число отрицательное, добавить его в первый массив.
        //Если число положительное, добавить его во второй массив.
        //Программа завершает работу, когда оба массива заполнены или, если пользователь ввёл 0

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива! Но не более 5 элементов.");
        int len = console.nextInt();

        int[] array1 = new int[len];
        int[] array2 = new int[len];

        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j <= array2.length; j++) {
                int num = console.nextInt();
               // array1[i] = console.nextInt();
                //array2[j] = console.nextInt();

                if ((num < 0) && num <= array1.length)
                {
                    array1[i] = num;
                } else if (num > 0 && num < array2.length)
                {
                    array2[j] = num;
                }
                if (array1.length == array2.length || num == 0) break;


            }

        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(array1.toString());
        System.out.println(array2.toString());

    }

}


