package com.Ishara;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args){
        int[] myarr = new int[5]; //array is reference type variable. so it can be declare using new keyword
        myarr[0] = 5;
        myarr[1] = 2;
        System.out.println(myarr); //by default java returns calculate based on the memory address
        String x = Arrays.toString(myarr);
        System.out.println(x);

        //new method for arrays

        int[] myarr2 = {5,2,3,8,4,5};
        System.out.println(myarr2.length); //java has fixed length. once initialized cannot add or remove items
        System.out.println(Arrays.toString(myarr2)); //before sort
        Arrays.sort(myarr2); //use to sort array
        System.out.println(Arrays.toString(myarr2)); //after sort


    }
}

