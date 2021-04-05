/*
    Write Java program to display the even numbers between 1 to 10
 */
package Selection_MathFn_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12_Even_Number {
    public static void main(String[] args) {
        try{
            for (int i = 0; i < 10; i++) {
                if (i% 2 == 0)
                    System.out.print(i+" ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        //Alternate way
//        for (int i = 2; i<=10;i=i+2)
//        {
//            System.out.println(" "+i);
//        }
    }
}
