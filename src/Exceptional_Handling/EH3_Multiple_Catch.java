//Multiple catch
package Exceptional_Handling;

public class EH3_Multiple_Catch {
    public static void main(String[] args) {
        int []a = new int[3];
        try{
//            for (int i=1;i<=3;i++)
//            {
//                a[i] = i*i;
//            }

            for (int i=0;i<3;i++)
            {
//                a[i] = i/i;
                a[i] = 0/0;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index is out of bounds");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero error");
        }
    }
}
//Ref: TP: 6.4.3
