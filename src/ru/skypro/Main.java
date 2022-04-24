package ru.skypro;

import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void main(String[] args) {
	// write your code here
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int[] days = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr [i];
            System.out.print(sum + " ");

        }
        System.out.println();

        int minSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i > maxSum) {
                maxSum = i;
            }
            if (i < minSum) {
                minSum = i;
            }
        }
        System.out.println("Максимальная сумма трат соствила " + maxSum + "рублей" + " max");
        System.out.println("Минимальная сумма трат составила " + minSum + "рублей" + " min");

        float averageSum;
        averageSum = sum / 30;
        System.out.println("Средняя сумма трат за месяц " + averageSum);

        char[] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int r = reverseFullName.length - 1; r >= 0; r--) {
            System.out.println(reverseFullName[r]);

        }










    }



}
