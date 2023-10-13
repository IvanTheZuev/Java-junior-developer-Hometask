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
            int num = console.nextInt();
            if(num < 0){
                array1[i] = num;
            } else if (num > 0) {
                array2[i] = num;
            }

        }
        for (int i = 0; i < array2.length; i++){
            System.out.println(array1);
        }

    }

}


