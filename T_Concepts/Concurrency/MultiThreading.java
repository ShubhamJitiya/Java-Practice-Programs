//USING THREAD CLASS

package Concurrency;


//BY EXTENDING THREAD WE CAN RUN PARALLELY - HI THEN HELLO ALTERNATE
class HI extends Thread //START - CALLS RUN
{ public void run()
    {
        for (int i = 0; i<=5; i++)
        {
            System.out.println("Hi .."); //Print hi 5 times
            try {
                Thread.sleep(500); //TAKE PAUSE
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//BY EXTENDING THREAD WE CAN RUN PARALLELY -HI THEN HELLO ALTERNATE
class Hello extends Thread //START - CALLS RUN - - OVERRIDE RUN METHOD
{
    public void run()
    {
        for (int i = 0; i<=5; i++)
        {
            System.out.println("Hello .."); //Print hello 5 times
            try {
                Thread.sleep(500); //TAKE PAUSE
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) //Main thread
    {

        HI obj1 = new HI();
        Hello obj2 = new Hello();

//        obj1.show(); //Print hi 5 times - INSTANT OP
//        obj2.show(); //Print hello 5 times - INSTANT OP

        //PRINTING WITH PAUSES - THREAD WILL WAIT FOR HALF A SECOND
        obj1.start();
        try{ Thread.sleep(10); }catch(Exception e){} //To overcome from clashes of hi hello
        obj2.start();

    }
}

//SCHEDULER - HI HELLO METS SAME TIME - MANY PROPERTIES IN WHICH IT SELECTS - LESS/MORE TIME- THREAD PRIORITY
//      IN THIS SELECTS RANDOM - IN THIS DEFAULT
//  DELAY OF 10 MILIS SO THERE'S NO ANY CLASH

//REF. T C