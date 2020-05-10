package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте кол-во строк в матрице: ");
        int s = in.nextInt();
        System.out.println("Задайте кол-во столбцов в матрице: ");
        int t = in.nextInt();
        int nums[][] = new int[s][t];
        for (int p = 0; p < s; p++) {
            for (int r = 0; r < t; r++) {
                System.out.println("Введите значение для " + (p + 1) + " строки и " + (r + 1) + " столбца массива: ");
                nums[p][r] = in.nextInt();
            }
        }
        System.out.println("Массив:");
                for (int v = 0; v < t; v++)
            System.out.print((nums[0][v] * 3) + " ");
    }
   }