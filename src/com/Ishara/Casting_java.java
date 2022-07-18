package com.Ishara;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Casting_java {
    public static void main(String[] args) {
        //implicit casting(auto casting)
        //byte > short > int > long >float >double
        short x = 1;
        int y = x + 1; //no need of casting
        System.out.println(y);
        double p = 3.1;
        double r = p + 2; //automatically get 2 as 2.0
        System.out.println(r);

        //explicit casting
        double z = 3.1;
        int q = (int)z + 2;
        System.out.println(q);

        //without competeble types
        String m = "8";
        int n = Integer.parseInt(m) + 3;
        System.out.println(n);

        String l = "8.3";
        double s = Double.parseDouble(l) + 4.2;
        System.out.println(s);
    }


}
