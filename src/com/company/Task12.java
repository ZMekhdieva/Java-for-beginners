package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = in.nextLine();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++)
            if (a[i] != ' ') {
                System.out.print(a[i]);
            }
    }
}
