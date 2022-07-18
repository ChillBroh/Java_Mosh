package com.Ishara;

public class String_ex {
    public static void main(String[] args) {
        java.lang.String message = new String("helloworld");
        java.lang.String newmessage = message;

        System.out.println(newmessage);
        message = "yoyo";
        System.out.println(newmessage);
        System.out.println(message);

    }
}

