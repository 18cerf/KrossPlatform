package Main;

import java.util.Scanner;

public class TaskFive {
    public static void Meth() {
        System.out.println("Введите кол-во уровней:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i > j) System.out.print("  ");
                else System.out.print(i == j || j == a - 1 || i == 0 || i == j * 2 ? "* " : "$ ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Meth();
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        if (width % 2 == 0) System.out.println("Ошибка!");
        else {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < width; j++) {
                    if (i < width / 2) {
                        if (j < width / 2 - i || j > width / 2 + i) System.out.print(' ');
                        else System.out.print('*');
                        continue;
                    } //нижняя половина
                    if (i > width / 2) {
                        if (j < i - width / 2 || j > width - (i - width / 2) - 1) System.out.print(' ');
                        else System.out.print('*');
                        continue;                  }
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}


