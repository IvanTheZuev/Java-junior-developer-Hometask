package hometask05;

import  java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        //Дан массив целых чисел: `int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44}`.
        //Найти максимальную сумму четырёх смежных целых
        //чисел в массиве task04. Использовать алгоритм скользящего окна.

        int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};

        Arrays.sort(task04);
        //System.out.println(Arrays.toString(task04));

        for (int i = 0; i < task04.length; i++){
            for (int j = i +1; j < task04.length; j++){
                for (int k = j +1; k < task04.length; k++){
                    for(int g = k + 1; g < task04.length; g++ ){
                        
                    }
                }
            }
        }



    }
}
