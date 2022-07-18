package com.Ishara;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int i,j;
        int[][] myarr = new int[3][2];
        Scanner x = new Scanner(System.in);
        for(i = 0; i < 3; i++){
            for(j = 0; j < 2; j++){
                myarr[i][j] = x.nextInt();
            }
        }
        System.out.println(Arrays.toString(myarr));
        System.out.println(Arrays.deepToString(myarr)); //to string is not enough for this cause this is multidimensional
    }
}
