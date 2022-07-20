package com.Ishara;

import java.util.Locale;
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        String input  =  "";
        Scanner getValue = new Scanner(System.in);
        //in this we can't use input != "quite" cause this will return boolean. but String is reference type
        while(!input.equals("quit")){ //run till the input is not equal quit
            System.out.print("Input : ");
            input = getValue.next().toLowerCase();
            System.out.println(input);
        }
    }
}
