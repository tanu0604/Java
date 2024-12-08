package ObjectOrientedProgramming.Inheritance.Example;

public class BoxWeight extends Box {
    double weight;

    //Creating a constructor
    BoxWeight()
    {
        this.weight=1;
    }

    BoxWeight (double l,double w, double h,double weight)
    {
        super(l,w,h);
        //What is the super doing?
        //It's calling the parent class constructor.
        //It will call the constructor  having 3 parameters
        //Use to initialize the values present in the parent class.
//        System.out.println(this.h);

        //We can also write. But why?
        //So if there is a similar variable both in the child and the parent class
        //and then we write super.variable_name it know that it has to access it from the parent class.
        System.out.println(super.h);
        this.weight=weight;
    }

    BoxWeight(double l,double weight)
    {
        super(l);
        this.weight=weight;
    }


}
