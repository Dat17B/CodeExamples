package Dat15v2;

/**
 * Created by lyng on 20/04/15.
 */
public class Run {
    public static void main(String[] args)
    {
        /*
        //Unchecked exception / runtime exception
        String[] strings =  {"første string på plads 0", "anden string på plads 1"};
        System.out.println("Hello");
        try {
            System.out.println(strings[2]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Hej");
        */
        /*
        //Checked exceptions
        try {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            //TO-DO
        }
        */
        /*
        //Nested catch
        String[] strings =  {"første string på plads 0", "anden string på plads 1"};
        try {
            System.out.println(strings[2]);
            Thread.sleep(1000);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Hej");
        */
        int a = 10;
        int b = 2;

        try {
            double result = a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.print("The user fucked up!");
        }

        try
        {
            validateAge(17);
            validateName("Bo");
        }
        catch (AgeValidationException e)
        {
            System.out.print("oh no");
        }
        catch (NameValidationException e)
        {
            System.out.print("not bo");
        }
    }

    public static void testException() throws InterruptedException
    {
        String[] strings =  {"første string på plads 0", "anden string på plads 1"};
        System.out.println(strings[2]);
    }

    public static void validateAge(int age) throws AgeValidationException
    {
        if(age<18)
        {
            throw new AgeValidationException();
        }
        else
        {
            System.out.print("All good");
        }
    }

    public static void validateName(String name) throws NameValidationException
    {
        if(name.length()<3)
        {
            throw new NameValidationException();
        }
    }
}
