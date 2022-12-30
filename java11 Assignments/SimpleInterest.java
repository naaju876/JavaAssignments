package com.Java11;

import java.util.*;
interface simple {
    void sI(int p, int r, int t);
}
public class SimpleInterest {
    public static void main(String args[])
    {
        simple intrest=(var a,var b,var c)->{
            var i=a*b*c/100;
            System.out.println("intrest="+i);
        };
        intrest.sI(20000,10,3);
    }
}
