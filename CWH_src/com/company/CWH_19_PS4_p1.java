package com.company;
import java.util.Scanner;
public class CWH_19_PS4_p1 {
    public static void main(String[] args) {

        //Question 1:
//        int a = 10;
//        if (a==11)
//            System.out.println("I am 11");
//        else
//            System.out.println("I am not 11");

        //Question 2
//        byte m1, m2, m3;
//
//        System.out.println("Enter your marks in Physics");
//        Scanner sc = new Scanner(System.in);
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your over all percentage is:" + avg);
//        if (avg>=40 &&m1>=33 && m2>=33 && m3 >= 33)
//            System.out.println("Congratulations, you have been promoted");
//        else
//            System.out.println("Sorry, you have been not promoted");

        //Question 3
//        float tax = 0;
//        float income = 3.3f;
//        if (tax<2.5)
//            tax = tax+0;
//        else if (tax>2.5f && tax<5f)
//            tax = tax + 0.05f*(income - 2.5f);
//        else if ()...

        //Question 4
//        Scanner sc = new Scanner(System.in);
//
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thrusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //Question 5
        //Question 6
//        String sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org"))
            System.out.println("This is an Organization Website");
        else if (website.endsWith(".com"))
            System.out.println("This is an Commercial Website");
       else
            System.out.println("This is an an Indian Website");



    }
}
