package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Task16 {
    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("Text.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ощибка ввода-вывода: " + exc);
        }
    }
}
