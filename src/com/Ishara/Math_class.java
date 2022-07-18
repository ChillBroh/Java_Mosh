package com.Ishara;

public class Math_class {
    public static void main(String[] args) {
        int result = Math.round(1.5F); //cannot do with this in long
        System.out.println(result);

        int result1 = (int)Math.ceil(2.5); //canot do with this in double
        System.out.println(result1);

        int result2 = (int)Math.floor(2.5); //return nearest small int number
        System.out.println(result2);

        int result3 = Math.max(1,2);
        System.out.println(result3);

        int result4 = Math.min(5,2);
        System.out.println(result4);

        int result5 = (int)Math.round(Math.random()*100); //this will default send double. so we need to cast and also round send long
        int result6 = (int)(Math.random()*100);
        System.out.println(result5);
        System.out.println(result6);
    }
}
