package hometask02;

public class Hometask02 {
    public static void main(String[] args) {

        //Первое задание

        int numberOfLetters = 20000;
        int numberOfSendLetters = 17000;

        System.out.println(numberOfLetters - numberOfSendLetters);

        //Второе задание

        var timeKmh = 19;
        var distanceKm = 2500;

        var velocity = distanceKm * 1000 / (timeKmh * 60 * 60);
        System.out.println(velocity);

        //Третье задание

        int naturalnumber = 98;
        naturalnumber = 9 + 8;
        System.out.println(naturalnumber);

        // Четвертое занятие

        long num1 = 1_000_000_000_000_000L;
        double num2 = -12.875;

        long reverseNum1 = -num1;
        double reverseNum2 = -num2;

        System.out.println(reverseNum1);
        System.out.println(reverseNum2);


    }
}
