//Threads using Interface
//Because multiple inheritance is not supported in java
//Runnable Interface - Functional Interface - Lambda Expression
package Concurrency;

class HI1 implements Runnable
{
    public void run()
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

class Hello1 implements Runnable //START - CALLS RUN - - OVERRIDE RUN METHOD
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



public class Multithread_Runnable_Interface {
    public static void main(String[] args) {

        //Runnable - Interface
       Runnable obj1 = new HI1();
       Runnable obj2 = new Hello1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try{ Thread.sleep(10); }catch(Exception e){} //To overcome from clashes of hi hello
        t2.start();


    }
}
//1. Extending interface/class
//2. Implementing interface - runnable
    //create obj of thread
        //pass obj of runnable