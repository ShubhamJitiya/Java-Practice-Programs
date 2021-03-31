package Concurrency;

public class MultiThreading_LambdaExpression {
    public static void main(String[] args) {

        //Anonymous class - Lambda expression

        Thread t3 = new Thread(()->
        {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi .."); //Print hi 5 times
                try {
                    Thread.sleep(500); //TAKE PAUSE
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t4 = new Thread(()->
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
        });

        t3.start();
        try{ Thread.sleep(10); }catch(Exception e){}; //To overcome from clashes of hi hello
        t4.start();

    }
}

//Reduce number of lines
//make code efficient - less number of classes

//Anonymous class - lambda expression