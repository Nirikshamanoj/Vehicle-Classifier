abstract class Vehicle
{
    abstract void start();
    abstract void stop();

}
class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Car Started");
    }
    @Override
    public void stop()
    {
        System.out.println("Car Stopped");
    }
}
class MotorCycle extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("MotorCycle Started");
    }
    @Override
    public void stop()
    {
        System.out.println("MotorCycle Stopped");
    }
}
public class VehicleClassifier
{
    public static void main(String[] args) {
        MotorCycle motorCycle=new MotorCycle();
        Car car=new Car();
        car.start();
        car.stop();
        motorCycle.start();
        motorCycle.stop();
    }
}

