package Slides;

public class RunASingleThread
{
    public static void main(String[] args)
    {
        // Creating an object of Thread
        // These two threads have no implemented run method
        Thread ordinaryThread = new Thread();
        Thread namedThread = new Thread("Some name");
        // This thread have a run method specified in the MyThread class
        Thread myThread = new MyThread();
        // These two threads is injecting the class MyRunnable(that implements the Runnable interface)
        // run method specified in the MyRunnable class
        Thread myRunnable = new Thread(new MyRunnable());
        Thread myNamedRunnable = new Thread(new MyRunnable(), "Some runnable thread name");

        // Start thread
        ordinaryThread.start();
    }
}
