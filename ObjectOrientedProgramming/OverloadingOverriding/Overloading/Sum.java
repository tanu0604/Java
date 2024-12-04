package ObjectOrientedProgramming.OverloadingOverriding.Overloading;

public class Sum
{
    //This is a small example of method overloading
    public static void main(String[] args) {
        calculateSum(5,6);
        calculateSum(5,7,10);
        calculateSum(5.3,6.7);
    }
    public static void calculateSum(int a,int b)
    {
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
    public static void calculateSum(int a,int b,int c)
    {
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
    public static void calculateSum(double a,double b)
    {
        double sum=a+b;
        System.out.println("Sum: "+sum);
    }
}
