package com.company;
import java.util.Scanner;
public class CWH_18_Else_if {
    public static void main(String[] args) {

        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

//        if (age>56)
//        {
//            System.out.println("You are experienced");
//        }
//        else if(age>46)
//        {
//            System.out.println("You are semi-expericed");
//        }
//        else if(age>36)
//        {
//            System.out.println("You are semi-semi-experience");
//        }
//        else
//        {
//            System.out.println("You are not experience");
//        }
//        if (age>2)
//            System.out.println("you are not baby");
        switch (age)
        {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to Retire");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
        System.out.println("Thanks for using my java code");


    }
}
