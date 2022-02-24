package Main;

// Java для поиска
// номер экстремума

import java.io.*;
import java.sql.Array;
import java.util.Scanner;

class TaskSeven {
    // функция для поиска
    // локальный экстремум
    static int extremMin(int a[], int n) {
        int countMin = 0;
        for (int i = 1; i < n-1; i++) {
            if (a[i] < a[i - 1] && a[i] < a[i + 1])
                countMin += 1;
        }
        return countMin;
    }

    static int extremMax(int a[], int n) {
        int countMax = 0;
        for (int i = 1; i < n-1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1])
                countMax += 1;
        }
        return countMax;
    }

    public static void main(String args[])
            throws IOException {

        int arr[] = {5, 1, 3, 3, 1};
        int n = arr.length;

        int arrtwo[] = new int[arr.length + 2];

        
        System.out.println();

        System.out.println("Min: " + extremMin(arr, n));
        System.out.println("Max: " + extremMax(arr, n));
    }

}

