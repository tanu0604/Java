package Strings;

public class StringMethods
{
    //In string whatever methods we apply it DOES NOT change the original string since strings are immutable.
    public static void main(String[] args) {
        String name="sitaRam";
        int len= name.length();
        System.out.println("The length of string : "+len);
        System.out.println();

        //Accessing any character of a string
        System.out.println("Finding character at a particular index : "+ name.charAt(5));
        System.out.println();

        //Checking whether 2 strings are equal
        String name2="SitaRam";
        System.out.println("Checking the equality of two strings: "+name.equals(name2));
        System.out.println("Checking the equality of two string by ignoring the case: "+name.equalsIgnoreCase(name2));
        System.out.println();


        //Comparing two strings: compareTo gives an integer value as it checks the ASCII value
        //therefore compareTo is case-sensitive (a(97) is not same as A(65) different ascii value)
        String str1="ramote";
        String str2="remote";
        //parsing character to integer
        System.out.println("ASCII Value of 'a' : "+('a'+0)); //97
        System.out.println("ASCII Value of 'e' : "+('e'+0)); //101

        System.out.println("Checking if two strings are same using the compareTo method : "+str1.compareTo(str2)); //97-101=-4

        //There is also a method that ignores the case
        String s1="APPLE";
        String s2="apple";
        System.out.println("Checking if two strings are same using the compareToIgnoreCase(ignores the case of the strings) method : "+s1.compareToIgnoreCase(s2)); //97-101=-4
        System.out.println();


        //Substring method
        String user="Joe Don";
        System.out.println("Substring");
        System.out.println(user.substring(2,7)); //from 2nd place till 6th
        // substring excludes the last index(in this case 7).

        System.out.println("Uppercase : "+user.toUpperCase());
        System.out.println("Lowercase: "+user.toLowerCase());
        System.out.println();


        //Removing unnecessary spaces
        String user2="      Amar Panchal                ";
        System.out.println("Before removal of space: "+user2);
        //String trim=user2.trim();
        System.out.println("After removing space: "+user2.trim());
        System.out.println();


        //Some more methods
        String user3="Edward Paul";
//        String newUser=user3.replace("Edward","John"); //John Paul
        String newUser=user3.replace("a","o"); //Edword Poul
        System.out.println(newUser);
        System.out.println("Does the string contains 'ward'?  "+user3.contains("ward")); //true
        System.out.println("Does the string contains 'r'?  "+user3.contains("r")); //true
        System.out.println("Does the string contains 'and' "+user3.contains("and")); //false

        //Finding the index of a character
        System.out.println("Index of character 'd': "+user3.indexOf('d')); //integer type //output: 1
        //NOTE: it prints the first index  occurrence of the given character


        System.out.println("Last index of character 'd' : "+user3.lastIndexOf('d')); //5


        //checking if  a string is blank or empty
        String blank="    ";
        String empty="";
        System.out.println(blank.isBlank()); //true
        System.out.println(empty.isEmpty());//true
        System.out.println(blank.isEmpty()); //false
        //it will false because the string blank contains spaces.

        System.out.println();

        //Integer to string

        System.out.println("Integer to String");
        int a=10;
        String s=String.valueOf(a);
        System.out.println(s);
    }
}
