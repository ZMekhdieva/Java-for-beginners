package com.company;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String s = in.nextLine();
        try {
            int x = Integer.parseInt(s);
            double y = x;
            System.out.println(s + "\n" + x + "\n" + y);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа!");
        }
    }
}

