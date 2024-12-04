package ObjectOrientedProgramming.OverloadingOverriding.Overriding;

public class Main
{
    public static void main(String[] args) {
        Parent parent=new Parent();
        Child child=new Child();
        //Calling parent class
        parent.draw();
        parent.dancing();

        //Calling child class
        child.draw();
        child.dancing();

        //Child class overriding the parent class
        Parent ch=new Child();
        System.out.println("The child class is overriding the parent class ");
        ch.draw();
        ch.dancing();
    }
}
