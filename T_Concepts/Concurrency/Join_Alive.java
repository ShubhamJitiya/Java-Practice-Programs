package Concurrency;

public class Join_Alive {
    public static void main(String[] args) throws Exception{

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

        System.out.println(t3.isAlive());
        t3.join();
        t4.join();
        System.out.println(" Bye" + "..."); //Print this line at end
        System.out.println(t3.isAlive());


    }
}

//Join - join will tell the main thread to
    //join again
//isAlive() - to check whether the thread is in running state or not