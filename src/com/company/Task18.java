package com.company;

import java.io.*;


public class Task18 {
    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("Text.txt"))) {
            int str = 0;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                str++;
            }
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Запись в файл");
            try (FileWriter fw = new FileWriter("Text.txt", false)) {
                                     for (int i = 0; i < str; i++) {
                    System.out.print(": ");
                    s = b.readLine();
                    s = s + "\r\n";
                    fw.write(s);
                }
            }
        } catch (IOException exc) {
            System.out.println("Ощибка ввода-вывода: " + exc);
        }
    }
}
