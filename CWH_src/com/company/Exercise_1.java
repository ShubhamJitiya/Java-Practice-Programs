package com.company;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.print("Enter marks for Sub:1 ");
        Scanner marks = new Scanner(System.in);
        int marks_1 = marks.nextInt();

        System.out.print("Enter marks for Sub:2 ");
        int marks_2 = marks.nextInt();

        System.out.print("Enter marks for Sub:3 ");
        int marks_3 = marks.nextInt();

        System.out.print("Enter marks for Sub:4 ");
        int marks_4 = marks.nextInt();

        System.out.print("Enter marks for Sub:5 ");
        int marks_5 = marks.nextInt();

        float sum;
        int per;

        sum = (marks_1 + marks_2 + marks_3 + marks_4 + marks_5)*100f/500;
//
//        sum = marks_1+marks_2+marks_3+marks_4+marks_5;
//        per = (sum*100f)/500;
        System.out.println("Percentage of 5 subjects is as below");

        System.out.println(sum);
//        System.out.println(per);




    }
}
