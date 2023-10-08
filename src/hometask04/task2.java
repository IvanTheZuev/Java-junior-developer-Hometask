package hometask04;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //Задача на WHILE
        //Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);
    }

}

