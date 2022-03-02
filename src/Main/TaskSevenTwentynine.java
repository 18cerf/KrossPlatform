package Main;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TaskSevenTwentynine {
    static int countSubarrays(int sum, int... arr) {
        int count = 0;
        int biggest = 0;
        int max = 0;
        int a = 0, b = 0, k = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int subTotal = 0;
            for (int j = i; j < n; j++) {
                subTotal += arr[j];
                if (subTotal == sum) {
                    count++;
                    System.out.println(subArr(i, j, arr));
                    if (j - i > biggest) {
                        biggest = j - i + 1;
                        k += 1;
                        if (k == 2) {
                            System.out.println("^ Наибольшая последовательность по условию");
                            System.out.println("|");
                        }
                        a = i;
                        b = j;
                    }
                }
            }
        }
        System.out.println("Длина наибольшей подпоследовательности = " + biggest);
        System.out.println("Первое значение данной подпоследовательности = " + arr[a]);
        return count;
    }

    static String subArr(int from, int to, int... arr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[').append(from).append("; ").append(to).append("]:");
        for (int i = from; i <= to; i++) {
            sb.append("  ").append(arr[i]);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        int[] arr = {5, 5, -5, -5, 0, 2, 2, -2 - 2, 10, 1, 11, 3, 3, -3, -3};
        System.out.println(Arrays.toString(arr) + "\n----");

        System.out.println("Найдено подпоследовательностей: " + countSubarrays(0, arr));
    }
}
