package Main;

import java.util.Scanner;

public class DTaskSix {
    private static double arctg(double x, int step) {
        if (Math.abs(x) >= 1) {
            throw new IllegalArgumentException("|x| не может быть < 1");
        }
        double result = 0.0;
        for (int i = 0; i < step; i++) {
            result += (Math.pow(-1, i) / (2 * i + 1)) * Math.pow(x, (2 * i + 1));
        }
        return result;
    }

    private static double arctg2(double x, int step) {
        if (Math.abs(x) >= 1) {
            throw new IllegalArgumentException("|x| не может быть < 1");
        }
        double result = 0.0;
        for (int i = 0; i < step; i++) {
            if ((Math.pow(-1, i) / (2 * i + 1)) * Math.pow(x, (2 * i + 1)) > 2.7)
                result += (Math.pow(-1, i) / (2 * i + 1)) * Math.pow(x, (2 * i + 1));
        }
        return result;
    }


    private static double arctg3(double x, int step) {
        if (Math.abs(x) >= 1) {
            throw new IllegalArgumentException("|x| не может быть < 1");
        }
        double result = 0.0;
        for (int i = 0; i < step; i++) {
            if ((Math.pow(-1, i) / (2 * i + 1)) * Math.pow(x, (2 * i + 1)) > 2.7 / 10)
                result += (Math.pow(-1, i) / (2 * i + 1)) * Math.pow(x, (2 * i + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во шагов:");
        int step = sc.nextInt();
        System.out.println("Введите Х:");
        double x = sc.nextDouble();
        double res = arctg(x, step);
        System.out.println("Сумма n слагаемых данного вида:");
        System.out.println(res);
        System.out.println("Сумма тех слагаемых, которые по абсолютной величине больше e:");
        System.out.println(arctg2(x, step));
        System.out.println("Сумма тех слагаемых, которые по абсолютной величине больше e/10:");
        System.out.println(arctg3(x, step));
        System.out.println("Значение функции с помощью методов Math:");
        System.out.println(Math.atan(x));
    }
}
