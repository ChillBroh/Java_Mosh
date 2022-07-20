package com.Ishara;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator_updated {
    public static void main(String[] args) {
        final int PERCENT = 100;
        final int ALL_MONTHS = 12;
        Scanner calculator = new Scanner(System.in);
        String principal;
        int principal2;
        double interest;
        int period;
        double M_rate;

        while(true){
            System.out.print("Principle ($1K - $1M : ");
            principal = calculator.next();
            principal2 = Integer.parseInt(principal);
            if((principal2 >= 1_000 && principal2 <= 1_000_000))
                break;
            else
                System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        System.out.print("Annual Interest Rate : ");
        interest = calculator.nextDouble();

        while(true){
            System.out.print("Period(years) :  ");
            period = calculator.nextInt();

            if(period >= 1 && period <= 30) {
                M_rate = interest / PERCENT / ALL_MONTHS;
                break;
            }
            else
                System.out.println("Enter a value between 1 and 30");
        }


        int months = period * ALL_MONTHS;
        double fraction = Math.pow((1 + M_rate),months);
        double calculation = (double)(M_rate * fraction) / (fraction - 1);
        double Mortgage = Double.parseDouble(principal) * calculation;
        System.out.println("Mortgage : " + NumberFormat.getCurrencyInstance().format(Mortgage));
    }
}
