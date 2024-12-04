package ExceptionHandling.UncheckedExceptions;

public class Example2
{
    public static void main(String[] args) {
        try {
            level1();
        }
        catch (Exception o)
        {
            //stackTrace will give detailed info where these the exception has occurred
            for (StackTraceElement stackTraceElement : o.getStackTrace()) {
                System.out.println(stackTraceElement);
            }

        }
    }

    public static void level3()
    {
        int[] arr=new int[5];
        arr[6]=10; //IndexOutOfBound because array is of size 5 and 6th index is assigned a value
    }
    public static void level2()
    {
        level3();
    }
    public static void level1()
    {
        level2();
    }


}
