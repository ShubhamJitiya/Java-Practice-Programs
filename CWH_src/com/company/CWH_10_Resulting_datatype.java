package com.company;

public class CWH_10_Resulting_datatype {
    public static void main(String[] args) {
//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a =y+z;
//        float b = 6.54f + x;
//        System.out.println(b);

        //Increment and Decrement operator
        int i = 56;
//        int b = i++; // First b is assigned then i will work
        int j = 67;
        int c = ++j; //First j is incremented then c is assigned j (68)

        System.out.println(i++);
        System.out.println(i);

        System.out.println(++i);
        System.out.println(i);

        int y = 7;
        System.out.println(++y*8);
        char ch = 'a';
        System.out.println(++ch);
    }
}
