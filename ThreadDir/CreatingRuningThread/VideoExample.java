package CreatingRuningThread;

public class VideoExample
{
    /**
     * Inner class extending the Thread class
     */
    public static class HelloWorldThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello World");
        }
    }

    /**
     * A runnable interface is implemented and used in the creation of a new thread.
     * This way the thread will run by the interface Runnable
     */
    public static class MyRunnableRandomNumber implements Runnable {

        @Override
        public void run()
        {
            System.out.println("Random Number: " + ((int)(Math.random() * 100) + 1));
        }
    }

    public static void main(String[] args)
    {
        // Creates an object of the thread class
        // Type Thread
        // Instance HelloWorldThread
        Thread hwThread = new HelloWorldThread();
        // Creating a Thread and injecting it with inner class MyRunnableRandomNumber
        Thread runThread = new Thread(new MyRunnableRandomNumber());

        // Runs the thread through the override method
        hwThread.run();
        // Running the thread through the interface
        runThread.run();
    }
}
