package ExceptionHandling.UncheckedExceptions;

public class Example1 {
    public static void main(String[] args) {
        int[] numerators = {10, 20, 30, 40};
        int[] denominators = {1, 2, 0, 10};
        //Here there are 4 elements and we are running the loop 10 time there IndexOutOfBound
        //so , here a try catch block is there after index 3 the exception will be shown.
        for (int i = 0; i < 10; i++) {
         try {
             int ans = divide(numerators[i], denominators[i]);
             System.out.println(ans);
         }
         catch (Exception t)
         {
             System.out.println(t);
         }
        }
        System.out.println("Program Completed");
    }
    /*
        public static int divide(int a,int b)
        {
            //Since one of the element is zero hence it will so  Runtime Error
            return a/b;
        }

     */


/*
The first two elements in the array will give an answer but when numerators[2]/denominators[2] it will give an exception
error because we say when we divide anything by zero it is infinity but here it has to give a finite answer hence gives
an exception. But for other cases answer is coming which means our code will give answers but there are few exception .
Hence, we need to resolve those exceptions so that our entire code is executed successfully.
 */


//Solving the runtime error

    public static int divide(int a,int b)
    {
        //This code shows how to handle exceptions
        //in try block there is a code which we want to execute
        try {
            return a/b;
        }
        //catch block is all about exception in this case dividing by zero is an exception which is ArithmeticException
        //hence it will not disrupt the normal flow of the program and execute successfully.
        catch (ArithmeticException e)
        {
            System.out.println(e);
            return 0;
        }
        //if there is some other exception then this block will be executed.
        catch (Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }
}