/*
    Write a switch statement that displays
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    0 1 2 3 4 5 6 accordingly
 */
package Selection_MathFn_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5_Weeks_Days {
    public static void main(String[] args) {

        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Value for day: ");
            int day = Integer.parseInt(input.readLine());

            switch (day) {
                case 0 -> System.out.println("Sunday");
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                default -> System.out.println("Good Bye");
            }
        }
        catch(NumberFormatException | IOException e)
        {
            System.out.println("Enter a number between 0-6");
        }
    }
}
//Switch Statement
//Ref: 2.1.5
