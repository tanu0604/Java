package ObjectOrientedProgramming.Inheritance.Example;

public class Box
{
    double l,w,h;
//    double weight;
    ///Creating a constructor

    Box()
    {
        this.l=1;
        this.w=1;
        this.h=1;
    }

    //Cube
    Box(double side)
    {
        this.l=side;
        this.w=side;
        this.h=side;
    }

    //Cuboid
    Box(double len,double wid,double ht)
    {
        this.l=len;
        this.w=wid;
        this.h=ht;
    }

    Box(Box old)
    {
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    public void information()
    {
        System.out.println("Running the box: ");
    }
}
