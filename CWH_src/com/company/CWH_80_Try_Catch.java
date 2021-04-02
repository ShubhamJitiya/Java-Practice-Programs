package com.company;

public class CWH_80_Try_Catch {
    public static void main(String[] args) {
        int a = 6000;
//        int b = 9;
        int b = 0; //Error

        //Without try
//        int c = a/b;
//            System.out.println("The result is : " + c);
//        int c = a/b;
        try
        {
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch (Exception e)
        {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
