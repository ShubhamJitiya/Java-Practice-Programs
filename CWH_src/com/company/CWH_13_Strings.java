package com.company;
import java.util.Scanner;

public class CWH_13_Strings {
    public static void main(String[] args) {
//        String name = new String(orginal: "Harry");
         String name = new String("Harry");

//        System.out.print(name);
//        System.out.println(name);

        int a = 6;
        float b = 5.654f;
        System.out.printf("The value of a is %d and the value of b is %f", a,b);
//        System.out.format("The value of a is %d and the value of b is %f", a,b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);



    }
}
