package com.company;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размер массива (кол-во элементов): ");
        int s = in.nextInt();
        int nums[] = new int[s];
        for (s = 0; s < nums.length; s++) {
            System.out.println("Введите значение " + (s + 1) + "го элемента массива: ");
            nums[s] = in.nextInt();
        }
        for(int i = nums.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( nums[j] > nums[j+1] ){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }
}
