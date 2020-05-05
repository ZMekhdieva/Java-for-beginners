package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        switch (number) {
            case 2:
            case 4:
            case 6:
                System.out.println("Данное значение имеется в константах.");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
    }
}