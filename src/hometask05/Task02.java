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

        int array1Index = 0;
        int array2Index = 0;

        while(true) {
            int number = console.nextInt();

            if(number > 0 && array1Index < array1.length){
                array1[array1Index] = number;
                array1Index++;
            } else if (number < 0 && array2Index < array2.length) {
                array2[array2Index] = number;
                array2Index++;

            } else if (number == 0 || (array1Index == array1.length && array2Index == array2.length)) {
                break;
            }
        }

    }

}


