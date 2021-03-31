package com.company;

import java.util.Scanner;

public class CWH_23_Ch4_For {
    public static void main(String[] args) {

        int i;
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

       /* for (i=0;i<n;i++) {
//            System.out.println(i);
//            odd  numbers: 1, 3, 5, 7, 9,
//                          i, i+2,
//                            1, 3, 5, 7

//            i = (i*2)-1;

//            System.out.println((i*2)-1);
            System.out.println((i*2)+1);
        }
        */

        //Print N natural numbers in reverse order
        for (i = n; i>0; i--){
            System.out.println(i);
        }

    }
}
