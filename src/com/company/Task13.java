package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String s1 = in.nextLine();
        System.out.println("Введите строку 2: ");
        String s2 = in.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 > l2)
            System.out.println(s1);
        else if (l2 > l1)
            System.out.println(s2);
        else System.out.println("Длина двух строк равна.");

    }
}

