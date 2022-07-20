package com.Ishara;

public class for_each {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Orange", "Mango" };

        for(String fruit : fruits )
            System.out.println(fruit);
        //for each can only use to forward and cannot get values from back
    }
}
