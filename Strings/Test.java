// Define the Test class to use the TestStudent class
package Strings;

public class Test {
    public static void main(String[] args) {
        // Create an instance of TestStudent
        TestStudent testStudent = new TestStudent();

        //the object testStudent stores the reference of the memory location where TestStudent is created
        //Objects are stored in the heap memory and variables testStudent holds the reference and point to the memory location

        // Assign values to the fields
        testStudent.name = "Tanushree";
        testStudent.address = "India";
        testStudent.standard = 5;
        testStudent.rollno = 20;

        // Print the values to verify
        System.out.println("Name: " + testStudent.name);
        System.out.println("Address: " + testStudent.address);
        System.out.println("Standard: " + testStudent.standard);
        System.out.println("Roll No: " + testStudent.rollno);
    }
}
