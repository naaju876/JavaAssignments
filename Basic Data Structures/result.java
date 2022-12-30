package com.company;
import java.util.Scanner;
public class result {

    public static void main(String[] args) {

        int sub1,sub2,sub3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of subject 1 : ");
        sub1=sc.nextInt();
        System.out.println("Enter marks of subject 2 : ");
        sub2=sc.nextInt();
        System.out.println("Enter marks of subject 3 : ");
        sub3=sc.nextInt();
        if(sub1>60 && sub2>60 && sub3>60) {
            System.out.println("PASSED");
        }else if((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub1>60 && sub3>60)) {
            System.out.println("PROMOTED");
        }
        else if(sub1>60 || sub2>60 || (sub1<60&&sub2<60&&sub3<60)) {
            System.out.println("FAILED");
        }
    }
}
