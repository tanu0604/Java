package ObjectOrientedProgramming.Inheritance.Example;

public class BoxPrice extends BoxWeight {
    double price;
    BoxPrice()
    {
        super();
        this.price=2;
    }
    //Call the constructor

    BoxPrice(double l,double w,double h,double weight,double price)
    {
        super(l,w,h,weight);
        this.price=price;
//        System.out.println(super.weight);
    }
}
