package hometask06;

public class Task01 {
    public static void main(String[] args) {
        //Дана строка, содержащая только буквы и цифры.
        //Вывести информацию о том, является ли данная трока палиндромом.

        String s1 = "111 Bbbaaaa 111";
        String s2 = "111 level 111";
        String reversedS1 = new StringBuilder(s1).reverse().toString();
        String reversedS2 = new StringBuilder(s2).reverse().toString();

        if (s1.equalsIgnoreCase(reversedS1) || s2.equalsIgnoreCase(reversedS2)){
            System.out.println("Строка является палиндромом.");
        }
        else{
            System.out.println("Строка не является палиндромом");
        }

    }
}
