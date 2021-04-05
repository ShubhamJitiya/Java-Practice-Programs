/*
       Write a program to calculate the sum of first 10 natural numbers
       using while loop
 */

package Selection_MathFn_Loops;

public class P8_SumOfNaturalNumbers {
    public static void main(String[] args) {
        int i = 1;
    int sum = 0;

    while (i<=10)
    {
        sum +=i;
//        System.out.print(sum + " ");
        i++;
    }
        System.out.print("The sum is: " + sum + " ");
    }
}
//Ref: TP 2.3.1