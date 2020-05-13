package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Itog1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String b = in.nextLine();
        int n = 0;
        for (int i = b.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n = n + (b.charAt(i) - '0') * j;
        }
        System.out.print(n);
    }
}
