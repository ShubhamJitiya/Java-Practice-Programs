/*
    Write a program to check if the number is positive or negative
    using conditional expression
 */
package Selection_MathFn_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6_Check_Neg {
    public static void main(String[] args) {
        {
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter some number: ");
                int num = Integer.parseInt(input.readLine());

                System.out.print((num<0)?"Number is Negative":"Number is positive");

            }
            catch (IOException e) {
                System.out.println(" ");
//                e.printStackTrace();
            }
        }
    }
}
//Conditional Expression
//Ref: TP 2.1.6