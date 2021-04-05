
/*
    Write a program in Java to print
    first n Fibonacci Series
 */
package Selection_MathFn_Loops;

public class P11_Fibonaccci {
    public static void main(String[] args) {

        int a, b, c;
        a = b = 1;
        for (int i = 0; i<10;i++)
        {
            System.out.println(" " + a);
            c = a+b;
            a = b;
            b = c;

        }
    }
}
