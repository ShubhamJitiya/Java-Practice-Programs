package com.company;

public class JavaTesting {
    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping " + num1 +" "+ num2);
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Before Swapping " + num1 +" "+ num2);
        swap(num1, num2);
        System.out.println("After Swapping " + num1 +" "+ num2);


    }
}
