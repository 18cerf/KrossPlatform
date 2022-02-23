package Main;

import java.util.Scanner;

public class TaskSix {
    static Scanner sc = new Scanner(System.in);

    // Функция для поиска дуги (x)
    static void find_Solution(double x, int n) {
        double sum = x, e = 2, o = 1, p = 1;

        for (int i = 2; i <= n; i++) {
            // Степень, до которой возводится 'x'
            p += 2;
            sum += (double) (o / e) *
                    (double) (Math.pow(x, p) / p);

            // Числовое значение
            o = o * (o + 2);

            // Значение знаменателя
            e = e * (e + 2);
        }
        System.out.println("Сумма n слагаемых заданного вида:");
        System.out.println(sum);
    }

    static void find_Solution_Task_Two(double x, int n) {
        double sum = x, e = 2, o = 1, p = 1;

        if (Math.abs((double) (o / e) * (double) (Math.pow(x, p) / p)) > Math.exp(1)) {
            for (int i = 2; i <= n; i++) {

                p += 2;
                sum += (double) (o / e) *
                        (double) (Math.pow(x, p) / p);

                o = o * (o + 2);

                e = e * (e + 2);
            }
            System.out.println("Сумма слагаемых, больших по абсолютной величине чем е");
            System.out.println(sum);
        } else System.out.println("нету слагаемых больше е");
    }

    static void find_Solution_Task_Three(double x, int n) {
        double sum = x, e = 2, o = 1, p = 1;

        if (Math.abs((double) (o / e) * (double) (Math.pow(x, p) / p)) > Math.exp(1) / 10) {
            for (int i = 2; i <= n; i++) {

                p += 2;
                sum += (double) (o / e) *
                        (double) (Math.pow(x, p) / p);

                o = o * (o + 2);

                e = e * (e + 2);
            }
            System.out.println("Сумма слагаемых, больших по абсолютной величине чем е/10");
            System.out.println(sum);
        } else System.out.println("нету слагаемых больше е/10");
    }



    public static void main(String[] args) {

        System.out.println("Введите x");
        double x = sc.nextDouble();
        System.out.println("Введите кол-во шагов");
        int n = sc.nextInt();

        if (Math.abs(x) > 1) {
            System.out.println("Неверный ввод!");
        } else {
            find_Solution(x, n);
            find_Solution_Task_Two(x, n);
            find_Solution_Task_Three(x, n);
            System.out.println("Значение функции с помощью метода Math: " + Math.asin(x));
        }
    }
}
