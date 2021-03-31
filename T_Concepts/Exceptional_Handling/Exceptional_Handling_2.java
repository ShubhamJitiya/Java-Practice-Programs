package Exceptional_Handling;

/*
//        All Types of Unchecked Exception - inherit RuntimeException
//        ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

        //NullPointerException
        String s = null;
        System.out.println(s.length());
        System.out.println("Continues Execution ..."); //Can't Execute this line
*/

/*
PTR:
1. A try block can be followed by one or more catch blocks (Multiple catch blocks)
2. At a time only one Exception occurs and At a time only one catch block executes
3. All catch blocks must be ordered from most specific to most general
4. parent exception - if it doesn't find appropriate exception
 */

public class Exceptional_Handling_2 {
    public static void main(String[] args) {
//        -------------------------------------------------------------------------------------------------------

        //ArithmeticException
        System.out.println("ArithmeticException: ");
        try{
//            int data = 100/0;

            System.out.println(100/0);
        }
        catch (ArithmeticException Ar_Ex)
        {
            System.out.println("\tCannot Divide by Zero - Arithmetic Exception");
        }
//        -------------------------------------------------------------------------------------------------------

        //NullPointerException
        System.out.println("NullPointerException: ");

        try{
            String s = null;

            System.out.println(s.length());
        }
        catch (NullPointerException Np_Ex)
        {
            System.out.println("\tNULL value in variable - Null Pointer Exception");
//            System.out.println("Continues Execution");
        }
//        -------------------------------------------------------------------------------------------------------

        //NumberFormatException
        System.out.println("NumberFormatException: ");

        try{
            String s = "abc";
            int i = Integer.parseInt(s); //?

            System.out.println(s);
        }
        catch (NumberFormatException Nf_Ex)
        {
            System.out.println("\tWrong formatting of any value - Number Format Exception");
        //            System.out.println("Continues Execution");
        }
//        -------------------------------------------------------------------------------------------------------

        //ArrayIndexOutOfBoundsException
        System.out.println("ArrayIndexOutOfBoundsException: ");

        try{
            int a[] = new int[5];
            a[10] = 50;

            System.out.println(a[10]);
        }
        catch (ArrayIndexOutOfBoundsException Aioob_Ex)
        {
            System.out.println("\tInserting any value in the wrong index - Array Index Out Of Bound Exception");
            //            System.out.println("Continues Execution");
        }
//        -------------------------------------------------------------------------------------------------------
        //Parent Exception
        System.out.println("Parent Exception: ");

        try{
            int a[] = new int[5];
            a[10] = 50;

            System.out.println(a[10]);
        }
        catch (ArithmeticException Ar_Ex)
        {
            System.out.println("\tCannot Divide by Zero - Arithmetic Exception");
            //            System.out.println("Continues Execution");
        }
        //Parent Exception
        catch (Exception ex)
        {
            System.out.println("\t "+ ex);
        }
//        -------------------------------------------------------------------------------------------------------
        //Multiple catch block - catch -> more specific to general (Correct)
        System.out.println("\nMultiple catch block - more specific to General (This must be followed) : ");



        try{
            int a[] = new int[5];
            a[10] = 50;

            System.out.println(a[10]);
        }
        catch (ArrayIndexOutOfBoundsException Aioob_Ex)
        {
            System.out.println("\tInserting any value in the wrong index - Array Index Out Of Bound Exception");
            //            System.out.println("Continues Execution");
        }
        catch (ArithmeticException Ar_Ex)
        {
            System.out.println("\tCannot Divide by Zero - Arithmetic Exception");
            //            System.out.println("Continues Execution");
        }
        //Parent Exception
        catch (Exception ex)
        {
            System.out.println("\t "+ ex);
        }
//        -------------------------------------------------------------------------------------------------------

        //Multiple catch block - catch -> general to more specific (also correct)
        System.out.println("\nMultiple catch block - General to more specific (except parent exception first): ");

        try{
            int a[] = new int[5];
            a[10] = 50;

            System.out.println(a[10]);
        }
        catch (ArithmeticException Ar_Ex)
        {
            System.out.println("\tCannot Divide by Zero - Arithmetic Exception");
            //            System.out.println("Continues Execution");
        }
        catch (ArrayIndexOutOfBoundsException Aioob_Ex)
        {
            System.out.println("\tInserting any value in the wrong index - Array Index Out Of Bound Exception");
            //            System.out.println("Continues Execution");
        }
        //Parent Exception
        catch (Exception ex)
        {
            System.out.println("\t "+ ex);
        }
//        -------------------------------------------------------------------------------------------------------

        //Multiple catch block - catch -> general to more specific (incorrect)
        System.out.println("\nMultiple catch block - (parent exception first): ");
        System.out.println("\t ERROR");


      /*
        try{
            int a[] = new int[5];
            a[10] = 50;

            System.out.println(a[10]);
        }
        catch (Exception ex) //this catch block must be the last catch block
        {
            System.out.println(ex);
        }
        catch (ArithmeticException Ar_Ex)
        {
            System.out.println("Cannot Divide by Zero - Arithmetic Exception");
            //            System.out.println("Continues Execution");
        }
        //Parent Exception
        catch (ArrayIndexOutOfBoundsException Aioob_Ex)
        {
            System.out.println("Inserting any value in the wrong index - Array Index Out Of Bound Exception");
            //            System.out.println("Continues Execution");
        }
        */
//        -------------------------------------------------------------------------------------------------------

        //Nested Try Block - part of a block may cause one error and the entire block itself may cause another error
        System.out.println("\nNested try: ");
        try{
            System.out.println("If exception occurs in outer try - not execute try-catch of inner try-catch");
            System.out.println("If no exception occurs in outer try-catch - checks all inner try catch");

//            int data = 100/0;
//            System.out.println(data);


            //ArrayIndexOutOfBoundsException
            try {
                int a[] = new int[5];
                a[10] = 50;

                System.out.println(a[10]);
            }
            catch (ArrayIndexOutOfBoundsException Aioob_Ex) {
                System.out.println("\t\tInserting any value in the wrong index - Array Index Out Of Bound Exception");
                System.out.println("\t\t First Exception is handled ");
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
                System.out.println("\t\tWrong formatting of any value - Number Format Exception");
                System.out.println("\t\t Second Exception is handled ");
            }
        }
        catch (ArithmeticException Ar_Ex)
        {
            System.out.println("\tCannot Divide by Zero - Arithmetic Exception");
            System.out.println("\tMain exception is handled ");
        }


        System.out.println("\n --- Continues Execution ---");

    }
}
