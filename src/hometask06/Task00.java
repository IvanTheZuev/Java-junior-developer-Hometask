package hometask06;

public class Task00 {
    public static void main(String[] args) {
        // char charAt(int index) возвращает значение char по указанному индексу.
        // Индекс колеблется от 0 до length()-1
        // Если char под заданным индексом представлен в виде юникода, результатом работы метода java charAt() будет символ,
        // который представляет данный юникод.

        String s1 = "Junior Java Developer";
        System.out.print(s1.charAt(0));
        System.out.print(s1.charAt(1));
        System.out.print(s1.charAt(2));
        System.out.print(s1.charAt(13) + "\n");

        //indexOf - indexOf(int ch)
        //Метод int indexOf(int ch) возвращает индекс в данной строке первого вхождения указанного символа.
        //Другими словами, мы получим номер первого вхождения заданного символа, считая слева-направо.
        //Если символ отсутсвует в строке - мы получим -1.


        String s2 = "Coding is the most painful thing in the world!";
        System.out.println(s2.indexOf("w"));

        //Метод int indexOf(int ch, int fromIndex) возвращает индекс в этой строке первого вхождения указанного символа,
        //начиная поиск по указанному индексу
        System.out.println(s2.indexOf("w", 20));

        //indexOf(String str)
        //Метод int indexOf(String str) возвращает индекс в данной строке первого вхождения указанной подстроки
        //Он кардинально отличается от первого варианта тем, что данный метод ищет уже целую подстроку (String).
        //Благодаря этому мы можем искать уже что-то более конкретное.

        System.out.println(s2.indexOf("world"));

        //все варианты indexOf - чувствительны к регистру

        //indexOf(String str, int fromIndex) - возвращает индекс в этой строке первого вхождения указанной подстроки,
        //начиная с указанного индекса.
        System.out.println(s2.indexOf("the", 1)); // 10
        System.out.println(s2.indexOf("the", 15));// 36

        //isEmpty - возвращает true, если строка пустая - строка.length() == 0
        //false - если строка заполнена

        String s3 = "";
        String s4 = " ";
        System.out.println(s2.isEmpty()); //false
        System.out.println(s3.isEmpty());//true
        System.out.println(s4.isEmpty());//false

        //substring - String substring(int beginIndex, int endIndex)

        String str = "Welcome to the hell!";
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 10));
    }
}
