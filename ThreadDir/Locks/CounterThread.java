package Locks;

public class CounterThread extends Thread
{
    private static Object lock = new Object();
    public static int counter = 1;
    private int upCount;

    public CounterThread(int upCount)
    {
        this.upCount = upCount;
    }

    @Override
    public void run() {
        //synchronized(lock)
        //{
            for (int i = 0; i < 10; i++)
            {

                try
                {
                    counter = counter + this.upCount;
                    Thread.sleep((int) (Math.random() * 500));
                    //System.out.println(Thread.currentThread().getName() + " added " + this.upCount + " to the counter");
                } catch (InterruptedException eI)
                {
                    eI.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " added " + this.upCount + " to the counter:\n" +
                    "Sum: " + counter);
        //}
    }
}
