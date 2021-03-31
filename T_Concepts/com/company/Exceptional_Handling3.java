package com.company;

public class Exceptional_Handling3 {
    public static void main(String[] args) {
        int i=8, j=2, k=0;
        int  a[] = new int[4];

        try{
            k = i/j;
            for (int o=0; o<=4; o++) {
            a[o] = o+1;
            }
            for(int value: a) {
                System.out.println(value);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Maximum number of values is 4");
        }
        System.out.println(k);
    }
    }
