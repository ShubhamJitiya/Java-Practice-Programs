package com.company;

public class CWH_33_Variable_Arguments {

//    static int sum(int a, int b)
//    {
//         return a+b;
//    }
//
//    static int sum(int a, int b, int c )
//    {
//         return a+b+c;
//    }
//
//    static int sum(int a, int b, int c, int d )
//    {
//         return a+b+c+d;
//    }

    static int sum(int ...arr)
    {
//        available as int [] arr;
        int result = 0;


        return result;
    }

/*
    static int sum(int x, int ...arr)
    {
//        available as int [] arr;
        int result = x;

        for (int a: arr)
        {
            result +=a;
        }
        return result;
    }
*/

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The Sum of nothing is: " + sum());
        System.out.println("The Sum of 4, 3 and 5 is: " + sum(4, 3, 5));
        System.out.println("The Sum of 2, 4, 3 and 5 is: " + sum(2, 4, 3, 5));
    }
}
