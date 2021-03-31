package com.company;

import java.util.Scanner;

public class CWH_25_PS4_p1 {
    public static void main(String[] args) {

//----------------------------------------------------------------

/*
//Problem: 1
    * * * * *
    * * * *
    * * *
    * *
    *
        int i, j;
        for(i = 5; i >=0 ;i--)
        {
            for ( j = 1;j <= i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
*/

//----------------------------------------------------------------

/*
        //Problem: 2
        //Sum N Even Numbers using while loop
//        2+4+6+8...

        int n, i = 1, sum = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (i <= n) {
//            System.out.println(2 * i);
            sum = sum+(2 * i);
            i++;
        }
        System.out.println(sum);
*/
/*
----------------------------------------------------------------
        //Problem: 3
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

    int n, i = 1, ans;
        System.out.println("Which integer's Table you want to calculate?");
        Scanner input = new Scanner(System.in);
    n = input.nextInt();
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
*/

/*

//----------------------------------------------------------------
//Problem: 4
        //Multiplication table in reverse order
        int  i = 10, ans;
//        System.out.println("Which integer's Table you want to calculate?");
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
//    ans = 1;
        while(i>=1)
        {
            ans=(10*i);
//        i = 1 ans = 2
//        i = 2 ans = 4
//        i = 3 ans = 12
            System.out.println("10" +" X "+i+" = "+ ans);
            i--;
        }
*/


/*

//----------------------------------------------------------------

//Problem: 5
//        Factorial of a number
//        4 = 4*3*2*1 //4*3
                      //3!*2
                      //2!*1
                      //fact = fact*n;
                      //n--;


//        3 = 3*2*1

       double fact = 1;
       int n;
        System.out.println("Factorial of ..?");
       Scanner input = new Scanner(System.in);
       n = input.nextInt();
       for (int i=n; i>=1; i--)
       {
           fact = fact*i;
       }
        System.out.println(fact);
*/

/*
        ----------------------------------------------------------------
        Problem: 6
        Repeat 5 using while loop
        Problem: 7
        Repeat 51 using for/while loop
         ----------------------------------------------------------------
        //Problem: 9
                int n = 8, i = 1, ans;
        //        System.out.println("Which integer's Table you want to calculate?");
        //        Scanner input = new Scanner(System.in);w
        //        n = input.nextInt();
                ans = 0;
                while (i <= 10) {
                    ans = ans + (n * i);
                    i++;
                }
                System.out.println("Sum of Table 8 is: " + " = " + ans);
        */

    }
}
