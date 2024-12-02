package ObjectOrientedProgramming.Test;

public class Test
{
    public static void main(String[] args) {
        Car car=new Car();
        car.color="Blue";
        car.speed=40;
        car.brand="Tata";
        car.model="Safari";
        car.year=2024;

        car.accelerate(1);
        System.out.println("Speed: "+car.speed);
        car.brake(9);
    }
}
