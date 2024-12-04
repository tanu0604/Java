package ExceptionHandling.FinallyKeyword;

public class Example1
{
    public static void main(String[] args) {
        System.out.println(divide(2,0));
    }
    public static int divide(int a,int b)
    {
     try {
         return a/b;
     }
     catch (Exception e)
     {
         return -1;
     }
     //hence we use finally
        finally {
         System.out.println("CODE EXECUTED");
     }

//        System.out.println("CODE EXECUTED");
//        this will give error because either the quotient is returned or -1 is returned
        //so this line will be unreachable.
    }
}
