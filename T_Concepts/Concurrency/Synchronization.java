package Concurrency;

class  Counter
{
    int count;
    public synchronized void increment() //maximum only one thread can work with this - synchronized
    {
        count++;
    }
}


public class Synchronization {
    public static void main(String[] args) throws Exception{

        Counter c = new Counter();

//        c.increment();
//        c.increment();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i<=1000;i++)
                {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 1; j<=1000;j++)
                {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
//
        t1.join(); //asking wait main thread till t1 complete
        t2.join();

        //gives weird values without synchronization
        System.out.println("count " + c.count);

    }
}
//both threads accesssing the count at the same time
    // We must make count as synchronized to ensure both are not accesing the sametime