package com.Ishara;

import java.text.NumberFormat;

public class Number_Format {
    public static void main(String[] args) {
        //NumberFormat currency = new NumberFormat(); //this is abstract class. so it cannot be initialized
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1587946.635);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.5);
        System.out.println(result2);

        //method chaining
        String result3 = NumberFormat.getPercentInstance().format(5.3);
        System.out.println(result3);



    }
}
