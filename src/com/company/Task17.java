package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Запись в файл будет остановлена при вводе строки - 'Стоп'");
        try (FileWriter fw = new FileWriter("Text.txt")) {
            do {
                System.out.print(": ");
                s = br.readLine();
                if (s.compareTo("Стоп") == 0)
                break;
                s = s + "\r\n";
                fw.write(s);
            }    while (s.compareTo("Стоп") != 0) ;
            } catch (IOException exc){
                System.out.println("Ощибка ввода-вывода: " + exc);

            }

        }
    }

