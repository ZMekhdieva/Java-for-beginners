package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число x: ");
        int x = in.nextInt();
        System.out.println("Введите число y: ");
        int y = in.nextInt();
        System.out.println("Введите число z: ");
        int z = in.nextInt();
        double a = (double) (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел x, y, z = " + a);
        int b = (int) a / 2;
        if (b > 3)
        System.out.println("Программа выполнена корректно");
    }
}

