import java.util.Scanner;

/**
    Programming challenges 03: Carpet Calculator
 */
public class RoomCarpetDemo
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner keyboard = new Scanner(System.in);
        
        // Get the length of the room.
        System.out.print("Enter the length of the room (in feet): ");
        double length = keyboard.nextDouble();

        // Validate the length of the room.
        while (length < 0)
        {
            System.out.println("Error: Negative value for length.");
            System.out.print("Enter the length of the room (in feet): ");
            length = keyboard.nextDouble();
        }

        // Get the width of the room.
        System.out.print("Enter the width of the room (in feet): ");
        double width = keyboard.nextDouble();

        // Validate the length of the room.
        while (width < 0)
        {
            System.out.println("Error: Negative value for width.");
            System.out.print("Enter the width of the room (in feet): ");
            width = keyboard.nextDouble();
        }

        // Create a RoomDimension object with the user's data.
        RoomDimension room = new RoomDimension(length, width);

        // Get the carpet price per square feet.
        System.out.print("Enter the carpet price per square feet: $");
        double carpetPrice = keyboard.nextDouble();

        // Validate the length of the room.
        while (carpetPrice < 0)
        {
            System.out.println("Error: Negative value for price.");
            System.out.print("Enter the carpet price per square feet: $");
            carpetPrice = keyboard.nextDouble();
        }

        // Create a RoomCarpet object and store data in it.
        RoomCarpet roomCarpet = new RoomCarpet(room, carpetPrice);

        // Display the information.
        System.out.println(roomCarpet);

        // Close the keyboard.
        keyboard.close();
    }
}