package com.ishara;

import java.util.Date;

public class Reference_Data_Types {
    public static void main(String[] args) {
        Date now = new Date(); //these are reference date types. scanners are also like this
        //reference data types must be created dynamically
        now.getTime(); //reference type has members like this getTime is a member of Date
        //we access to members with . operators
        //also system is a class. we access it's members using dot like system.out.print
        System.out.println(now);
    }
}

