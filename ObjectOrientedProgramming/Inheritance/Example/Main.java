package ObjectOrientedProgramming.Inheritance.Example;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("Box 1:  "+box1.l+" "+ box1.w+" "+ box1.h);

        //When 1 parameter is passed then the constructor containing 1 parameter will execute
        Box box2=new Box(4);
        System.out.println("Box 2:  "+box2.l+" "+ box2.w+" "+ box2.h);

        //When 3 parameters are passed then the constructor containing 3 parameters will execute
        Box box3=new Box(6,8,9);
        System.out.println("Box 3:  "+box3.l+" "+ box3.w+" "+ box3.h);

        //when box type parameter is passed
        Box box4=new Box(box3);
        System.out.println("Box 4:  "+box4.l+" "+ box4.w+" "+ box4.h);

        //This is showing how BoxWeight class has inherited the properties of Box class
        BoxWeight box5=new BoxWeight(2,6,89,9);
        System.out.println("Box 5:  "+box5.h+"  "+ box5.weight);

        BoxWeight box6=new BoxWeight(2,6,89,9);
        System.out.println("Box 6:  "+box6.l+"  "+ box6.weight);


        //Here is a proof where we can see that the child class can access the properties of the parent class
        //But the parent class cannot access any properties of the child class.
//        Box box7=new BoxWeight(8,12,6,9);
//        System.out.println("Box 7:  "+box7.weight); here it is giving an error.

        //BoxPrice constructor

        BoxPrice box8=new BoxPrice(7,0,9,0,8);
        System.out.println("Box 8:  "+box8.l+" "+box8.w+" "+ box8.h+" "+ box8.weight+" "+ box8.price);


        BoxPrice box9=new BoxPrice();
        System.out.println("Box 9:  "+box9.l+" "+ box9.w+ " "+box9.h+" " +box9.weight+" "+ box9.price);
    }
}
