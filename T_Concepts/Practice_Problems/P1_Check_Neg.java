/*
    WAP to check if the number is negative or not
 */

package Selection_MathFn_Loops.Practice_Problems;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;

public class P1_Check_Neg {

    public static void main(String[] args) {

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a Number: ");

            String input_Num = input.nextLine();
//            System.out.println(Character.isDigit(Integer.parseInt(input_Num)));

            if (Integer.parseInt(input_Num) > 0)
                System.out.println("Number is not Negative");
            else if (Integer.parseInt(input_Num) < 0)
                System.out.println("Number is Negative");
        }
        catch (NumberFormatException e) {
            System.out.println("Please Enter a number");
//            e.printStackTrace();
        }
    }

}

//Ref: TP - 2.1.1