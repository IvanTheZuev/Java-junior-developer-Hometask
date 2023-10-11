package hometask05;

import java.util.Arrays;

public class Task00 {
    public static void main(String[] args) {
        //Разобрать методы класса `java.util.Arrays` и ответить на вопросы:
        // 1. Чем метод `Arrays.equals(...)` отличается от метода `Arrays.compare(...)`?
        // 2. Для чего используется метод `Arrays.mismatch(...)`?

        //1. Метод Arrays.equal(name1, name2) сравнивает вернет true, если равны длины массивов и содержимое.
        // А метод Arrays.compare вовзращает число в формате int. 0 - если массивы равны, -1 - если массивы не равны.


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 6};
        int[] arr4 = {1, 2, 3, 4, 6,7};

        //System.out.println(Arrays.equals(arr1, arr2)); //true
        //System.out.println(Arrays.equals(arr1, arr3)); // false
        //System.out.println(Arrays.equals(arr1, arr4)); // false

        //
        //System.out.println(Arrays.compare(arr1, arr4)); //-1
        System.out.println(Arrays.compare(arr1, arr2));//0

        //2. Arrays.mismatch(...) - находит и возвращает индекс первого несоответствия
        System.out.println(Arrays.mismatch(arr3, arr4)); // вернет 5 - это индекс несоответсвия arr4
    }
}
