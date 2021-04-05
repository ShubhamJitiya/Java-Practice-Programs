/*
    Write a program to display a multiplication table of 1 to 10
    using nested loop
 */
package Selection_MathFn_Loops;

public class P13_Multiplication_Table {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------");
        System.out.println("\tMultiplication Table");
        System.out.println("---------------------------------------------");

        for (int i = 1; i<=10;i++)
        {
            System.out.print(i+" | ");
            for (int j = 1; j<=10;j++)
                System.out.printf("%4d", i*j);
            System.out.println();
        }
    }
}
//Ref: 2.3.6