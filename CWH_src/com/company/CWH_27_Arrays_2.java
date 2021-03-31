package com.company;

public class CWH_27_Arrays_2 {
    public static void main(String[] args) {
//
//        float [] marks = {10.0f, 28.0f, 30.6f,4.25f};
//        System.out.println(marks[2]);
//
//        String [] students = {"Harry", "Shubham", "Rohan", "Lovish"};
//        System.out.println(students.length);
//        System.out.println(students[1]);

        int [] marks = {100, 200, 300,400};
        System.out.println("Length of the array: " + marks.length);
        //Displaying the array (Naive way)

        //Using for loop
//        for (int i= 0; i<marks.length;i++)
//            System.out.println(marks[i]);

//        for (int i= marks.length-1; i>=0;i--)
//            System.out.println("In reverse order: " + marks[i]);

        //for each loop
        for (int element:marks)
            System.out.println(element);

    }
}
