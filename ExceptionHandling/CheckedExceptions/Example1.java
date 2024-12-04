package ExceptionHandling.CheckedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example1
{
    public static void main(String[] args)throws FileNotFoundException {
        method1();
    }
    public static void method2()throws FileNotFoundException
    {
        try {
            FileReader fileReader=new FileReader("a.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FILE NOT FOUND");
//            System.out.println(e.getMessage());
//            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
    public static void method1()throws FileNotFoundException
    {
        method2();
    }
}
