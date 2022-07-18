package com.Ishara;

import java.util.Locale;

public class String_Members {
    public static void main(String[] args) {
        String message = "hello world" + "!!";
        System.out.println(message.endsWith("!!")); //return boolean
        System.out.println(message.startsWith("he"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("b")); //return -1
        System.out.println(message.replace("!", "@")); //this is not modify the original string
        //any method always return new one


        System.out.println(message);
        String message2 = "hey babe";
        System.out.println(message2.endsWith("be"));
        System.out.println(message2.toUpperCase());
        String message3 = "    heyy babe";
        System.out.println(message3);
        System.out.println(message3.trim()); //remove white spaces
        String message4 = "Hello \"Ishara\"";
        System.out.println(message4);
        String message5 = "C:\\Documents\\"; //print backslash with another black slash
        System.out.println(message5);

    }
}
