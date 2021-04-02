package com.company;

import java.util.Scanner;

public class CWH_79_Errors_Demo {
    public static void main(String[] args) {
        //Logical errors demo
        //wap to print all prime numbers between 1 to 10

        //LOGICAL ERROR DEMO//
        System.out.println(2);
        for (int i=1;i<5;i++)
        {
            System.out.println(2*i+1);
        }
        //ODD NUMBERS INSTEAD OF PRIME NUMBERS//

        //RUNTIME ERROR - EXCEPTION
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is: " + 1000/k);
        //Throws exception if 0 or float is entered
    }
}
