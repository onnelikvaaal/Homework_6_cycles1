public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 3");// мой ламерский вариант
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 3");// второй вариант
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 2.1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        System.out.println("Задача 2.2");
        for (int i = 7; i <= 98; i = i + (14 - 7)) { //знаю, что усложнила, проще всего было бы написать втупую i + 7 или i += 7, но я хотела, чтобы программа посчитала чуточку больше
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 2.3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
            if (i == 512) {
                System.out.println();// переводим каретку вниз по завершении цикла, чтобы был отступ между задачами
            }
        }
        System.out.println();

        System.out.println("Задача 3.1");
        int cash = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + cash;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + total);
        }
        System.out.println();

        System.out.println("Задача 3.2");
        int cash1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + cash1;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + total1);
        }
    }
}