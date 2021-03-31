package com.company;

public class CWH_34_Recursion {
   /*
    static int factorial (int n)
    {
        // Factorial (0) = 1;
        //Factorial(n) = n * n-1 * ......1
        //factorial (5) = 5 * 4 * 3 * 2 * 1;
        // Factorial (n) = n * factorial (n-1)
        if (n==0 || n==1) {
            return 1;
        }
        else
        {
            return (n*factorial(n-1));
        }
    }
    */
    static int factorial_Iterative (int n)
    {
        if (n==0 || n==1) {
            return 1;
        }
        else
        {
            int product = 1;
            for (int i=1; i<=n;i++)
            {
                product *=i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
    int n = 4;
//        System.out.println("The value of factorial n is : " + factorial (n));
        System.out.println("The value of factorial n is : " + factorial_Iterative (n));
    }
}
