package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class Itog3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввежите текущий курс RUB-USD в формате __,__: ");
        double c = in.nextDouble();
        System.out.println("Введите сумму в рублях в формате __,__: ");
        double r = in.nextDouble();
        double u = r / c;
        BigDecimal ru = new BigDecimal(u);
        ru = ru.setScale(2, ROUND_HALF_UP);
        System.out.print("Сумма в долларах: " + ru);
    }
}