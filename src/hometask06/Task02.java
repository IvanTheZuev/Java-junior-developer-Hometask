package hometask06;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        //Задача #2
        //Даны две строки, строки, содержащие только буквы английского алфавита.
        // Вывести информацию о том, являются ли одна строка анаграммой другой строки.

        String str1 = "Book";
        String str2 = "Koob";

        boolean areAnagrams = Arrays.equals(
                str1.toLowerCase().chars().sorted().toArray(),
                str2.toLowerCase().chars().sorted().toArray());
        if(areAnagrams == true){
            System.out.println(str1 + " является анаграммой строки " + str2 + ".");
        }
        else{
            System.out.println(str1 + " не является анаграммой строки " + str2 + ".");
        }

    }
}
