package Strings;

public class TestString
{
    public static void main(String[] args) {
        String a=new String("Ram"); //creates new memory location
        String b=new String("Ram"); //again, new memory location

        // therefore a and b are pointing to different memory locations and are different.
        String c="Ram";
        String d="Ram";

        //Checking the reference of the variables
        System.out.println(a==b);
        //it will give false because new memory locations are created.

        //c and d will be stored in the string pool in same memory location
        System.out.println(c==d); //true

        //String pool - Storage area in the heap memory where string literals are stored.
    }

}
