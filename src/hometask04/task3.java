package hometask04;


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {;
        Scanner scanner = new Scanner(System.in);
        int userGuessNumber;
        int guessNumber = (int) (Math.random() * 9) + 1;
        while (scanner.hasNextInt()){
            userGuessNumber = scanner.nextInt();
                if (userGuessNumber > guessNumber && userGuessNumber != 0){
                    System.out.println("Загаданное число меньше");
                }
                else if (userGuessNumber < guessNumber && userGuessNumber != 0){
                    System.out.println("Загаданное число больше");
                } else if (userGuessNumber == guessNumber && userGuessNumber != 0) {
                    System.out.println("Вы угадали число!");
                    break;
                }
                else if (userGuessNumber == 0) {
                    break;
                }
                }
        }
    }

