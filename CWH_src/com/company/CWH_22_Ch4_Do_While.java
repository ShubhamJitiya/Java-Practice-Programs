package com.company;

import java.util.Scanner;

public class CWH_22_Ch4_Do_While {
    public static void main(String[] args) {
//        int a = 10;

//        while(a<5)
//        {
//            System.out.println(a);
//            a++;

//    }
        //Print upto n Natural numbersw
        int i = 1, n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
