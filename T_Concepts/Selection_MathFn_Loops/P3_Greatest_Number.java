/*
    WAP to find the Greatest number among three
 */
package Selection_MathFn_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface P3_Greatest_Number {
    public static void main(String[] args) throws IOException {
//        InputStreamReader r = new InputStreamReader(System.in)

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Value of a: ");
            double a = Double.parseDouble(br.readLine());

            System.out.print("Enter Value of b: ");
            double b = Double.parseDouble(br.readLine());

            System.out.print("Enter Value of c: ");
            double c = Double.parseDouble(br.readLine());

            if (a > b) {
                if (a > c)
                    System.out.println("a is Greater");
                else
                    System.out.println("c is Greater");
            } else {
                if (b > c)
                    System.out.println("b is Greater");
                else
                    System.out.println("c is Greater");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Enter correct value");
        }
    }
}
//Nested if statement
//Ref: TP 2.1.4
