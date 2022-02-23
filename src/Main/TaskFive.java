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
    }
}


