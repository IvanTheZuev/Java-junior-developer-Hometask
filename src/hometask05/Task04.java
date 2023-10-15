package hometask05;

import  java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        //Дан массив целых чисел: `int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44}`.
        //Найти максимальную сумму четырёх смежных целых
        //чисел в массиве task04. Использовать алгоритм скользящего окна.

        int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};

        int windowSize = 4;
        int windowStartIndex = 0;
        int currentWindowSum = 0;
        int maxSum = 0;

        for(int windowEndIndex = 0; windowEndIndex < task04.length; windowEndIndex++){
            currentWindowSum += windowEndIndex;

            //if()
        }



    }
}
