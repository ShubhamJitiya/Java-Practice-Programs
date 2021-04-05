/*
    Write a program to count the sum of first 100 Natural numbers
    using for loop
 */
package Selection_MathFn_Loops;
public class P10_SumOfNN_100 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i<=100; i++)
        {
            sum+=i;
        }
        System.out.println("Sum is: " + sum);
    }
}
