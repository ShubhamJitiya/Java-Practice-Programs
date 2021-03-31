package com.company;

import java.util.Scanner;

public class CWH_35_PS6 {
   /*
   p1
    static void multiplicationTable(int n)
    {
        //Multiplication table of a given number n.

//        Step: 1     read n = 2
//
//        Step:2
//
//        2x1= 2
//        2x2= 4
//        2x3= 6
//        2x4= 8
//        2x5= 10
//        2x6= 12
//        2x7= 14
//        2x8= 16
//        2x9= 18
//        2x10=20
//
//        General form: ans = (n*i)
//
//        Step: 3
//            Display- n+" X "+i+" = " ans
        int i = 1, ans;

//    ans = 1;
        while(i<=10)
        {
            ans=(n*i);
//        i = 1 ans = 2
//        i = 2 ans = 4
//        i = 3 ans = 12
            System.out.println(n+" X "+i+" = "+ ans);
            i++;
        }
    }    */
    //----------------------------------------------------------------

    //Problem: 2
    static void pattern_1()
    {
        for (int i=0; i<5;i++)
        {
            for (int j = 0; j<i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
//----------------------------------------------------------------
        /*
//Problem: 1
        //Multiplication table using method
        int n, ans;
        System.out.println("Which integer's Table you want to calculate?");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        multiplicationTable(n);
        */
        //----------------------------------------------------------------

        //Problem: 2
        //Pattern:
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        pattern_1();




    }
}
