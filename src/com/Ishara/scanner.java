package com.Ishara;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); //system.in means we are going to get inputs from terminal
        byte age = obj.nextByte();
        System.out.println("you are " + age);

        String name = obj.next(); //next only read one token. (one part)
        Scanner obj2 = new Scanner(System.in); //one object from class can read one type from string
        String name2 = obj2.nextLine().trim(); //next line read all tokens
        //also can write name2.trim();
        System.out.println("You are "+ name);
        System.out.println("You are "+ name2);



    }
}
