/*
       WAP to Check Grades
 */

package Selection_MathFn_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_Check_Grade {
    public static void main(String[] args) throws IOException {

        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Marks between 0 - 100");
            float marks = Float.parseFloat(br.readLine());

            if (marks>= 90)
                System.out.println("Grade A");
            else if (marks>=80)
                System.out.println("Grade B");
            else if(marks>=70)
                System.out.println("Grade C");
            else if(marks>=60)
                System.out.println("Grade D");
            else
                System.out.println("Grade F");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter only numbers");
        }


    }
}

//MultiWay IF statement
