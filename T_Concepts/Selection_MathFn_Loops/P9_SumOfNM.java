/*
    Write a program to calculate the
    sum of all the numbers entered by the user
    using do-while loop
 */

package Selection_MathFn_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9_SumOfNM {
    public static void main(String[] args) {

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            int num;

            System.out.println("Enter the number (Input -99 to terminate)");
            num = Integer.parseInt(input.readLine());

            do {
                sum = sum + num;
                System.out.println("Enter the number (Input -99 to terminate)");
                num = Integer.parseInt(input.readLine());
            }
            while(num!=-99);
            System.out.println("The sum is: " + sum);

        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
//Ref: TP : 2.3.2