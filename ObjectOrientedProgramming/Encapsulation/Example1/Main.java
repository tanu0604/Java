package ObjectOrientedProgramming.Encapsulation.Example1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting and getting the name
        student.setName("Paul");
        System.out.println("Name: " + student.getName());

        // Setting and getting the roll number
        student.setRollno(23);
        System.out.println("Roll Number: " + student.getRollno());

        // Setting and getting the marks
        student.setMarks(99);
        System.out.println("Marks: " + student.getMarks());
    }
}
