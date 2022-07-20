package com.Ishara;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        int num;
        Scanner number = new Scanner(System.in);

        System.out.print("Number : ");
        num = number.nextInt();

        if((num % 5) == 0 && (num % 3) == 0 )
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Fizz");
        else if (num % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);
    }
}
