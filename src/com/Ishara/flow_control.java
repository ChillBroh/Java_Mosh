package com.Ishara;

public class flow_control {
    public static void main(String[] args){
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy"; //using ternary operator

        switch(className){
            case "First" :
                System.out.println("Congratulations You are in first class");
                break;
            case "Economy" :
                System.out.println("Congratulations You are in economy class");
                break;
            default :
                System.out.println("You are not eligible");
        }
    }
}
