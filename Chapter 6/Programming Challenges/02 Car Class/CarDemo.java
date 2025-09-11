public class CarDemo
{
    public static void main(String[] args)
    {
        // Create a Car object.
        Car myCar = new Car(2020, "Honda");

        // Calls the accelerate function 5 times and display 
        // the car's speed.
        System.out.println("Accelerating....");
        for (int count = 0; count < 5; count++)
        {
            // Accelerate my car.
            myCar.accelerate();

            // Display its speed.
            System.out.println("Curren speed: " + myCar.getSpeed());
        }

        // Calls the brake function 5 times and display the
        // car's speed.
        System.out.println("Applying the brake....");
        for (int count = 0; count < 5; count++)
        {
            // Apply the brake.
            myCar.brake();

            // Display its current speed.
            System.out.println("Current speed: " + myCar.getSpeed());
        }
    }
}