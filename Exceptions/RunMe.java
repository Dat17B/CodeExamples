import java.util.Scanner;

public class RunMe
{
    /**
    Information and links
    Youtube.com:
        <video>
            <name>Java Exception - Java Programming Tutorial</name>
            <description>Theory of exceptions</description>
            <time>2:42</time>
            <link>https://www.youtube.com/watch?v=AmcLEkvVILI</link>
        </video>
        <video>
            <name>Java Video Tutorial 6</name>
            <description>ArithmeticException, InputMismatchException, FileNotFoundException, throws exception(s)</description>
            <time>15:42</time>
            <link>https://www.youtube.com/watch?v=EWj60p8esD0</link>
        </video>
        <video>
            <name>Java Exception Handling-Checked and Unchecked exceptions, Manually throwing exceptions</name>
            <description>
                checked vs unchecked exceptions, throw(s).

            </description>
            <time>17:08</time>
            <link>https://www.youtube.com/watch?v=qL4ddETfS2A</link>
        </video>
     */

    // This is the game try'n'catch me.
    // Calling a lot of methods that will come with an exception.
    // Catch it and create your own message to display.

    // NullPointerException
    // IndexOutOfBoundException
    // FileNotFoundException
    // IOExceptions
    // SQLExceptions
    // ArithmeticException
    // InputMismatchException
    // ....

        /*
        1. Throw exceptions
        2. Throws exceptions
         */


    // Create own Exception
    public static void main(String[] args)
    {
        // Methods with exceptions
        outOfBounds();
        divideNumbers();
        fileNotFound();

        // nice tree of exceptions
        streamExceptionTree();

        // Costume exception
        ownException();
    }

    /**
     Array Index Out Of Bounds Exception
     */
    public static void outOfBounds() {
        int[] arrayInt = new int[3];
        System.out.println(arrayInt[5]);
    }

    /**
     Arithmetic Exception and Input Mismatch Exception
      <name>Java Programming Tutorial - 82 - Exception Handling</name>
      <link>https://www.youtube.com/watch?v=K_-3OLkXkzY</link>
      <time>9.01</time>
     Exception handling is for handling an error. If the user is doing something they are not suppose to do,
       the system will get an error and crash the system. We want to handle the the error and keep the program running.
     */
    public static void divideNumbers() {
        // some functionality to divide two numbers
        Scanner scanner = new Scanner(System.in);
        int n1 = 0, n2 = 0, sum = 0;
        System.out.println("Enter first num: ");
        n1 = scanner.nextInt();
        System.out.println("Enter second num: ");
        n2 = scanner.nextInt();

        // Exception happens here
        sum = n1/n2;
        System.out.println("Sum is: " + sum);
    }
}
