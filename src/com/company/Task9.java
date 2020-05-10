package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размер массива (кол-во элементов): ");
        int s = in.nextInt();
        int nums[] = new int[s];
        for (s = 0; s < nums.length; s++) {
            System.out.println("Введите значение " + (s + 1) + "го элемента массива: ");
            nums[s] = in.nextInt();
        }
        System.out.println("Массив:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Значение " + (i + 1) + "го элемента массива = " + (nums[i] * 2));
        }
    }}

