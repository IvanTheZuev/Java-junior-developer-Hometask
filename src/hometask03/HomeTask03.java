package hometask03;

public class HomeTask03 {
    public static void main(String[] args) {

        //Задание №1. [10;500]
        //Самостоятельно изучить `Math.random()` для генерации псевдослучайных чисел.
        //2. Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка `[10;500]` в
        //интервал `(25;200)` и выводить результат в консоль.

        int randomNumber = (int) (Math.random() * 500) + 10;
        if (randomNumber > 25 && randomNumber < 200){
            System.out.println(randomNumber);
        } else {
            System.out.println("Число не принадлежит диапазону");
        }

        //Задание №2
        //Дана переменная currentScoreValue - количество очков, набранное пользователем.
        //Если пользователь набрал 90 и более очков, он занял первое место.
        //Если пользователь набрал от 80 до 89, он занял второе место.
        //Если пользователь набрал от 70 до 79, он занял третье место.
        //Если пользователь набрал меньше 70, он не занял никакого места.
        //Вывести в консоль, какое место занял пользователь.

        int currentScoreValue = (int) Math.random() * 100;
        if (currentScoreValue > 90){
            System.out.println("Вы заняли первое место!");
        } else if (currentScoreValue > 80 && currentScoreValue <= 89) {
            System.out.println("вы заняли второе место!");
        } else if (currentScoreValue > 70 && currentScoreValue <= 79) {
            System.out.println("Вы заняли третье место!");
        } else {
            System.out.println("К сожалению, Вы не заняли никакого места!");
        }

        //Задание №3
        //Даны переменные x и y - координаты точки на плоскости.
        //
        //Необходимо определить четверть координатной плоскости, которой принадлежит данная точка. Результат вывести в консоль.
        //
        //Если обе координаты положительны, точка принадлежит первой четверти.
        //Если координата x отрицательна, а y положительна, точка принадлежит второй четверти.
        //Если обе координаты отрицательны, точка принадлежит третьей четверти.
        //Если координата x положительна, а y отрицательна, точка принадлежит четвёртой четверти.

        int x = -1;
        int y = -5;

        if (x > 0 && y > 00){
            System.out.println("Точка принадлежит первой четверти!");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка принадлежит второй четверти!");
        } else if (x < 0 && y <0) {
            System.out.println("Точка принадлежит третьей четверти!");
        }
        else{
            System.out.println("Точка приналежит четвертой четверти!");
        }

        //Четвертое задание
        //Дана переменная monthNumber, которая хранит порядковый номера месяца.
        // И переменная isLeap, которая хранит информацию о том, является ли год високосным.
        //Написать программу, которая в зависимости от значения monthNumberвыводит в консоль количество дней в этом месяце.
        // Необходимо рассмотреть два случая: год не является високосным и год является високосным.

        int monthNumber = 12;
        boolean isLeap = false;

        switch(monthNumber){

            case 1:
                if (monthNumber == 1)
                {
                System.out.println("Январь - 31 день.");
                }
            case 2:
                if (isLeap == true && monthNumber == 2) {
                    System.out.println("Высокосный год: февраль - 29 дней.");
                } else System.out.println("Февраль - 28 дней.");
            case 3:
                if (monthNumber == 3)
                {
                System.out.println("Март - 31 день.");
                }
            case 4:
                if (monthNumber == 4)
                {
                    System.out.println("Апрель - 30 дней.");
                }
            case 5:
                if (monthNumber == 5)
                {
                System.out.println("Май - 31 день.");
                }
            case 6:
                if (monthNumber == 6)
                {
                System.out.println("Июнь - 30 дней");
                }
            case 7:
                if (monthNumber == 7)
                {
                System.out.println("Июль - 31 день.");
                }
            case 8:
                if (monthNumber == 8)
                {
                System.out.println("Август - 31 день.");
                }
            case 9:
                if (monthNumber == 9)
                {
                System.out.println("Сентябрь - 30 дней.");
                }
            case 10:
                if (monthNumber == 10)
                {
                System.out.println("Октябрь - 31 день.");
                }
            case 11:
                if (monthNumber == 11)
                {
                System.out.println("Ноябрь - 30 дней.");
                }
            case 12:
                if (monthNumber == 12)
                {
                System.out.println("Декабрь - 31 день.");
                }
        }


        //Пятое задание
        // Даны переменные `couponNumber` - номер купона и `resultSum` - сумма покупки.
        // 1. Если номер купона - 1111, скидка 10%,
        // 2. Если номер купона - 3333, скидка 20%,
        // 3. Если номер купона - 5555, скидка 30%.
        // 4. В остальных случаях скидка не предусмотрена.
        //
        // Необходимо вычислить и сохранить в переменную `resultSum` сумму с учетом скидки, если она предусмотрена.
        // Вывести значение `resultSum` в консоль.

        int couponNumber = 5555;
        int resultSum = 15000;

        switch (couponNumber)
        {
            case 1111:
                System.out.println(resultSum - resultSum * 0.1);
                break;
            case 3333:
                System.out.println(resultSum - resultSum * 0.2);
                break;
            case 5555:
                System.out.println(resultSum - resultSum * 0.3);
                break;

        }






    }
}
