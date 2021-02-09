package Exceptional_Handling;

/*
//        All Types of Unchecked Exception - inherit RuntimeException
//        ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

        //NullPointerException
        String s = null;
        System.out.println(s.length());
        System.out.println("Continues Execution ..."); //Can't Execute this line
*/

public class Exceptional_Handling_2 {
    public static void main(String[] args) {

        //ArithmeticException
        try{
            int data = 100/0;

            System.out.println(100/0);
        }
        catch (ArithmeticException Ar_Ex)
        {
            System.out.println("Cannot Divide by Zero - Arithmetic Exception");
        }

        //NullPointerException
        try{
            String s = null;

            System.out.println(s.length());
        }
        catch (NullPointerException Np_Ex)
        {
            System.out.println("NULL value in variable - Null Pointer Exception");
//            System.out.println("Continues Execution");
        }

        //NumberFormatException
        try{
            String s = "abc";
            int i = Integer.parseInt(s); //?

            System.out.println(s);
        }
        catch (NumberFormatException Nf_Ex)
        {
            System.out.println("Wrong formatting of any value - Number Format Exception");
//            System.out.println("Continues Execution");
        }
        //ArrayIndexOutOfBoundsException
        try{
            int a[] = new int[5];
            a[10] = 50;

            System.out.println(a[10]);
        }
        catch (ArrayIndexOutOfBoundsException Aioob_Ex)
        {
            System.out.println("Inserting any value in the wrong index - Array Index Out Of Bound Exception");
//            System.out.println("Continues Execution");
        }

        System.out.println("Continues Execution");

    }
}
