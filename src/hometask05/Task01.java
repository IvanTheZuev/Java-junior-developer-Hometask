package hometask05;

public class Task01 {
    public static void main(String[] args) {
        //Задача #1
        //Объявить массив целых чисел. Длина массива - 15.
        // Заполнить массив четными числами в диапазоне [10, 100). Для заполнения массива использовать цикл.
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i * 10;
            if(array[i] > 0 && array[i] <= 100)
            {
            System.out.print(array[i] + " ");
            }
        }
    }
}
