/*
    WAP to check Even or ODD
 */
package Selection_MathFn_Loops.Practice_Problems;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P2_Even_Odd {
    public static void main(String[] args) {

        try{
            System.out.print("Enter a Number: ");

            Scanner input = new Scanner(System.in);
            int value = input.nextInt();

            if (value % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Enter Integer");
        }
    }
}
//Ref: TP 2.1.2