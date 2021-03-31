//https://www.youtube.com/watch?v=XDlxr2wYNfU&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=29

 package com.company;

import java.util.Scanner;

public class CWH_29_PS5_p1 {
    public static void main(String[] args) {
/*
        ---------------------------------------------------------
        Problem: 1
        Create an array of 5 floats and calculate their sum
                float [] marks;
                marks = new float[5];
                float sum = 0;
                Scanner input = new Scanner(System.in);
                for (int i = 0; i<5; i++) {
                    System.out.println("Enter marks for Subject: " + (i + 1));
                    marks [i] = input.nextFloat();
                }
                for (int i = 0; i<5; i++) {
        //            System.out.println("Marks for Subject: " + (i+1) + " -> " + marks[i]);
                    sum += marks[i];
                }
                System.out.println("Sum of 5 Subjects: " + sum);
        */

/*       ---------------------------------------------------------
//                Problem: 2
//        Given integer is present or not
        int []a;
        a = new int [5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 Integers ...");

        for(int i = 0; i<5; i++)
        {
            a[i] = input.nextInt();
        }

        System.out.println("Enter Integer which you want to find ...");
        int temp = input.nextInt();
        boolean count=true;
//        temp = input.nextInt();
        for(int i = 0; i<5; i++)
        {
            if(temp == a[i]) {
                System.out.println("Integer is found at position: " + (i+1));
                count = false;
            }
        }
        if (count)
            System.out.println("Element " + temp+ " is not present is this array ...");
*/

        //        ---------------------------------------------------------
//                Problem: 3
//        Average marks from an array containing marks of all students in physics using for each loops

        /*        float [] marks;
        marks = new float[5];
        float sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            System.out.println("Enter marks for Subject: " + (i + 1));
            marks [i] = input.nextFloat();
        }
        for (int i = 0; i<5; i++) {
            //            System.out.println("Marks for Subject: " + (i+1) + " -> " + marks[i]);
            sum += marks[i];
        }
//        System.out.println("Average of 5 Students (Physics): " + sum/5.0f);
        System.out.println("Average of 5 Students (Physics): " + sum/marks.length);
        */

//        ---------------------------------------------------------
//                Problem: 4
//        Add two matrix of size 2x3
        //2 rows - 3 Columns => 2i-3j
/*
        int[][] A = new int[2][3];

        int[][] B = new int[2][3];
        Scanner input = new Scanner(System.in);

        //Reading Matrix Element: A
        System.out.println("\nEnter Matrix Element: A");
        for (int i = 0; i<2;i++) //a-i //2 rows
        {
            for (int j = 0; j<3; j++) // a-j //3 columns
            {
                A[i][j] = input.nextInt();
            }
        }

        //Reading Matrix Element: B
        System.out.println("\nEnter Matrix Element: B");
        for (int i = 0; i<2;i++) //b-i //2 rows
        {
            for (int j = 0; j<3; j++) // b-j //3 columns
            {
                B[i][j] = input.nextInt();
            }
        }

        //Printing Matrix

        System.out.println("\nMatrix: A");
        for (int i = 0; i<2;i++) //a-i //2 rows
        {
            for (int j = 0; j<3; j++) // a-j //3 columns
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("\nMatrix: B");
        for (int i = 0; i<2;i++) //b-i //2 rows
        {
            for (int j = 0; j<3; j++) // b-j //3 columns
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\nAddition of Matrix A + B");
        for (int i = 0; i<2;i++) //a-i //2 rows
        {
            for (int j = 0; j<3; j++) // a-j //3 columns
            {
                System.out.print(A[i][j]+ B[i][j]+" " );
            }
            System.out.println(" ");
        }
        */


//        ---------------------------------------------------------
/*
//                Problem: 5
//        Reverse an array
        //Find Mid
        //Swap corresponding elements -> Swap (i = length - i -1)
        int [] Array;
        int Elements;
        System.out.println("How many elements you want to Enter ?");
        Scanner input = new Scanner(System.in);
        Elements = input.nextInt();
        Array = new int[Elements];

        //Reading Elements in array
        for (int i = 0; i<Array.length;i++)
        {
            System.out.println("Element: " + (i+1));
            Array[i] = input.nextInt();
        }

        //Traversing Elements
        System.out.println("Elements Before reversing");
        for (int i = 0; i<Array.length;i++)
        {
            System.out.print(Array[i]+", ");
        }

        //Swapping
        System.out.println("Elements After reversing");
        for (int i = 0; i<Array.length/2;i++)
        {
            int temp;
            temp = Array[i];
            Array[i] = Array[Array.length-i-1];
            Array[Array.length-i-1] = temp;
        }

        //Traversing Elements
        System.out.println("Elements Before reversing");
        for (int i = 0; i<Array.length;i++)
        {
            System.out.print(Array[i]+", ");
        }
*/

//        ---------------------------------------------------------
//                Problem: 6
//       Find maximum in an
       /*
        int [] Array;

        System.out.println("Maximum Int: "+Integer.MAX_VALUE);
        System.out.println("Minimum Int: "+Integer.MIN_VALUE);

        int Elements, Max = -2147483648;
        System.out.println("How many elements you want to Enter ?");
        Scanner input = new Scanner(System.in);
        Elements = input.nextInt();
        Array = new int[Elements];

        //Reading Elements in array
        for (int i = 0; i<Array.length;i++)
        {
            System.out.println("Element: " + (i+1));
            Array[i] = input.nextInt();
        }

        //Traversing Elements

        for (int i: Array)
        {
            if (i>Max)
                Max = i;
        }
        System.out.println("Maximum Element in Array: " + Max);
*/

//        ---------------------------------------------------------
//                Problem: 7
//        minimum in array

       /*
        int [] Array;

        System.out.println("Maximum Int: "+Integer.MAX_VALUE);
        System.out.println("Minimum Int: "+Integer.MIN_VALUE);

        int Elements, Min = 2147483647;
        System.out.println("How many elements you want to Enter ?");
        Scanner input = new Scanner(System.in);
        Elements = input.nextInt();
        Array = new int[Elements];

        //Reading Elements in array
        for (int i = 0; i<Array.length;i++)
        {
            System.out.println("Element: " + (i+1));
            Array[i] = input.nextInt();
        }

        //Traversing Elements

        for (int i: Array)
        {
            if (i<Min)
                Min = i;
        }
        System.out.println("Minimum Element in Array: " + Min);
          */

//        ---------------------------------------------------------
//                Problem: 8
//        find whether array is sorted or not
        /*
        int [] Array;
        int Elements;
        System.out.println("How many elements you want to Enter ?");
        Scanner input = new Scanner(System.in);
        Elements = input.nextInt();
        Array = new int[Elements];

        //Reading Elements in array
        for (int i = 0; i<Array.length;i++)
        {
            System.out.println("Element: " + (i+1));
            Array[i] = input.nextInt();
        }

        //Checking sorting
        boolean is_sorted = true;
        for (int i = 0; i< Array.length-1; i++)
        {
           if (Array[i]>Array[i+1]) {

               is_sorted = false;
               break;
           }
        }
        if (is_sorted)
        {
            System.out.println("Array is sorted ");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
        */
    }
}
