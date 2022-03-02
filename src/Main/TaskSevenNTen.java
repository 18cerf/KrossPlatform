package Main;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;

class TaskSevenNTen {
    static int extremMin(int a[], int n) {
        int countMin = 0;

        if (a[0] < a[1])
            countMin += 1;

        if (a[a.length - 1] < a[a.length - 2])
            countMin += 1;


        for (int i = 1; i < n - 1; i++) {
            if (a[i] < a[i - 1] && a[i] < a[i + 1])
                countMin += 1;
        }
        return countMin;
    }

    static int extremMax(int a[], int n) {
        int countMax = 0;

        if (a[0] > a[1])
            countMax += 1;

        if (a[a.length - 1] > a[a.length - 2])
            countMax += 1;

        for (int i = 1; i < n - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1])
                countMax += 1;

        }

        return countMax;
    }

    public static void main(String args[]) {
        Random random = ThreadLocalRandom.current();
        int[] arr = random.ints(6, -5, 10).toArray();
        System.out.println("Массив:");
        for (int x :arr
             ) {
            System.out.print(x+" ");
        }
        int n = arr.length;

        System.out.println();

        System.out.println("Локальный минимум: " + extremMin(arr, n));
        System.out.println("Локальный максимум: " + extremMax(arr, n));
    }

}

