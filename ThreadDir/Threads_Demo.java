public class Threads_Demo extends Thread
{
    private static int counter = 0;

    public static void main(String[] args)
    {
        Threads_Demo humhum1 = new Threads_Demo();
        Threads_Demo humhum2 = new Threads_Demo();
        Threads_Demo humhum3 = new Threads_Demo();
        Threads_Demo humhum4 = new Threads_Demo();
        // humhum1.setName("some name");
        humhum1.start();
        humhum2.start();
        //humhum3.start();
        //humhum4.start();

        int pause = -1;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 11; i++)
        {
            try
            {
                System.out.println("Mother thread runs " + i + "'th time.");
                counter = counter + 1;
                pause = (int) (Math.random() * 2000);
                Thread.sleep(pause);
            }
            catch (InterruptedException interruptEx)
            {
                System.out.println(interruptEx);
            }
        }
        long result = System.currentTimeMillis() - startTime;
        System.out.println(Thread.currentThread().getName() + "did the run in " + result / 1000.0 + " seconds.");
    }

    public Threads_Demo()
    {
        // doing nothing in the constructor
    }

    public void run()
    {
        String myName = Thread.currentThread().getName();
        int pause = -999;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 11; i++)
        {
            try
            {
                System.out.println(myName + " being executed " + i + "'th time.");
                counter = counter + 1;
                pause = (int) (Math.random() * 3000);
                Thread.sleep(pause);
                //Thread.sleep(1);
            } catch (InterruptedException interruptEx)
            {
                System.out.println(interruptEx);
            }
        }
        long result = System.currentTimeMillis() - startTime;
        System.out.println(myName + " did the run in " + result / 1000.0 + " seconds.");
    }
}