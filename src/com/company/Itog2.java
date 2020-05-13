package com.company;

import java.util.Scanner;

public class Itog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размер массива (кол-во элементов): ");
        int s = in.nextInt();
        int nums[] = new int[s];
        for (s = 0; s < nums.length; s++) {
            System.out.println("Введите значение " + (s + 1) + "го элемента массива: ");
            nums[s] = in.nextInt();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[i];
                int j = i;
                while (j > 0 && temp < nums[j - 1]) {
                    nums[j] = nums[j - 1];
                    j--;
                }
                nums[j] = temp;
            }
        }
    }
}
