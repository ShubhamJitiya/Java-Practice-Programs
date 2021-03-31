package Exceptional_Handling;

public class Exceptional_Handling_1 {
    public static void main(String[] args) {

/*
        //Below code will not Execute if it counters Exception

        int num = 100/0; //Arithmetic Exception can not divide by zero
        System.out.println(num);
        System.out.println("Continue Execution ..."); //Control will not execute this line
*/

///*
        try {
            //place exception code
            int num = 100/0;
        }
        catch (ArithmeticException ex)
        {
            //handle the exception
            System.out.println(ex);
        }
        //Execution Continues
        System.out.println("Continue Execution ...");
//*/
    }
}

/*
    NOTES:
----------------------------------------------------------------------------------------------
                THROWABLE
EXCEPTION              -----  ERROR
(IO,SQL - CHECKED)          (STACK OVERFLOW, VIRTUAL MACHINE, OUTOFMEMORY)
(RUNTIME- UNCHECKED)

RUNTIME EXCEPTIONAL: ArithmeticException, NullPointer, ArrayIndexOutOfBoundsException
----------------------------------------------------------------------------------------------

///////////////////////////
try{
    place exception code
}
catch(){
    handle the exception
}
finally{
    executed whether an exception is handled or not
}
///////////////////////////

----------------------------------------------------------------------------------------------

throw - throw an exceptinal
throws - declare exceptional always used with method signature

 */