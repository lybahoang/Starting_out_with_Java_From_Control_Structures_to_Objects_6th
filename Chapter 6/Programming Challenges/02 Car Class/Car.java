/**
    The Car class rerpresents a car with its year model, make, and
    speed.
 */
public class Car
{
    private int yearMake;   // The year model of the car.
    private String make;    // The make of the car.
    private int speed;      // The speed of the car.

    /**
        Constructor
        @param year The year make of the car.
        @param carMake The make of the car.
     */
    public Car(int year, String carMake)
    {
        yearMake = year;
        make = carMake;
        speed = 0;
    }

    /**
        The getYearMake function returns the year model of a car
        @return The value in the yearMake field.
     */
    public int getYearMake()
    {
        return yearMake;
    }

    /**
        The getMake function returns the make of a car
        @return The value in the make field.
     */
    public String getMake()
    {
        return make;
    }
    
    /**
        The getSpeed function returns the current speed of a car
        @return The value in the speed field.
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
        The accelerate function adds 5 to the speed of the car
     */
    public void accelerate()
    {
        speed += 5;
    }

    /**
        The brake function subtracts 5 from the speed of the car
     */
    public void brake()
    {
        speed -= 5;
    }
}