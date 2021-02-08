package com.company;

public class Exception_Handling2 {
    public static void main(String[] args) {

//        int i=0, j=2, k; // Running correct
        int i=8, j=0, k=0;
//        k = i/j;

        try{
            k = i/j;
        }
        catch(Exception e)
        {
            System.out.println("Cannot divide by zero");
        }
        System.out.println();
    }
}
