package com.company;

import java.util.Scanner;

public class CWH_86_PS_Chapter_14 {
    public static void main(String[] args) {

        //Problem-1

        // Syntax error
//        int a = 7

        //Logical error
        int age = 78;
        int year_born = 2000-78;
//        System.out.println(6/0);

        //Problem-2
        try{
            int a = 666/0;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Hehe");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Haha");
        }

        //Problem-3
        boolean flag = true;

        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        //Max retry is 5
            while (flag && i < 5) {
                try {
                    System.out.println("Enter the value of Index: ");
                    index = sc.nextInt();
                    System.out.println("The value of marks int is: " + marks[index]);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid Index");
                    i++;
                }
            }
            if (i>=5)
            {
                System.out.println("Error");
            }
        //Problem-4


    }

}
