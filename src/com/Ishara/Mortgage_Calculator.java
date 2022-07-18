package com.Ishara;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        System.out.print("Principle : ");
        String principal = calculator.next();
        System.out.print("Annual Interest Rate : ");
        double interest = calculator.nextDouble();
        System.out.print("Period(years) :  ");
        int period = calculator.nextInt();

        double M_rate = interest/100/12.0;
        int months = period * 12;
        double fraction = Math.pow((1 + M_rate),months);
        double calculation = (double)(M_rate * fraction) / (fraction - 1);
        double Mortgage = Double.parseDouble(principal) * calculation;
        System.out.println("Mortgage : " + NumberFormat.getCurrencyInstance().format(Mortgage));
    }
}