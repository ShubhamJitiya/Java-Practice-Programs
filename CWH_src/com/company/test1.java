package com.company;

public class test1 {
    public static void main(String[] args) {
        int i =5, j= 10;
        System.out.println("i=" + i + "j=" + j);
        int t = i;
        i = j;
        j = t;
        int k = 0;
        while(k<5)
        {
            System.out.println("i=" + i + "j=" + j);
            k++;
        }
    }
}
