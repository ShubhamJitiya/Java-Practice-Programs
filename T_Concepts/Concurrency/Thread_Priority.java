package Concurrency;

public class Thread_Priority {
    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new Thread(()->
        {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi .." + Thread.currentThread().getPriority()); //Print hi 5 times
                try {
                    Thread.sleep(500); //TAKE PAUSE
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Hi Thread");
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
        }, "Hello thread");

//        t3.setName("Hi Thread");
//        t4.setName("Hello Thread");

//        new Thread(runnable interface, name)

//        t3.setPriority(1);
//        t4.setPriority(10);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t3.getPriority()); //range is from 1-10
        System.out.println(t4.getPriority());
        t3.start();
        try{ Thread.sleep(10); }catch(Exception e){}; //To overcome from clashes of hi hello
        t4.start();



        System.out.println(t3.getName());
        System.out.println(t4.getName());
        t3.join();
        t4.join();
        System.out.println(" Bye" + "..."); //Print this line at end
        System.out.println(t3.isAlive());

    }
}

//name thread
//Priority : 1-10
    //1 - least
    //5 -  normal
    //10 - highest
//constants - MIN_PRIORITY, MAX_PRIORITY