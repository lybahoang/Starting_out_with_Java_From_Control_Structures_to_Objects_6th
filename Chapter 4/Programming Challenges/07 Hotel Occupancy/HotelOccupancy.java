import java.util.Scanner;
/**
 * This program shows my solution to the programming challenge 7 chapter 4.
 * Booke: Starting out with Java: From Control Structures to Objects (6th).
 * Date: 09 September 2025.
 */

public class HotelOccupancy
{
    public static void main(String[] args)
    {
        short numOfFloors;              // The number of floors.
        short totalRooms = 0;           // The total number of rooms.
        short numOfRooms;               // The number of room in each floor.
        short totalOccupiedRooms = 0;   // The total number of occupied rooms.
        short numOfOccupiedRooms;       // The number of occupied room in each floor.
        short totalVacantRooms;         // The total number of vacant rooms.

        // Create a Scanner object and connect it to the System.in object
        // to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of floors in the hotel.
        do
        {
            System.out.print("How many floors are there in the hotel? ");
            numOfFloors = keyboard.nextShort();

            // If the number of floors is less than 1, then display an error
            // message.
            if (numOfFloors < 1)
            {
                System.out.println("The number of floors must be at least 1");
            }
        } while (numOfFloors < 1);

        // Loop through each floor and get its number of rooms and its number of
        // occupied rooms.
        for (int floor = 1; floor <= numOfFloors; floor++)
        {
            // Get the number of rooms in the floor.
            System.out.println("Enter data for the floor #" + (floor));
            do
            {
                System.out.print("How many rooms are there? ");
                numOfRooms = keyboard.nextShort();

                if (numOfRooms < 10)
                {
                    System.out.println("The number of rooms should be at least 10.");
                }
            } while (numOfRooms < 10);

            // Add it to the total number of rooms.
            totalRooms += numOfRooms;

            // Get the number of occupied rooms in the floor.
            System.out.print("How many rooms are occupied? ");
            numOfOccupiedRooms = keyboard.nextShort();

            // Add it to the total number of occupied rooms.
            totalOccupiedRooms += numOfOccupiedRooms;
        }

        // Calculate the total number of vacant rooms.
        totalVacantRooms = (short)(totalRooms - totalOccupiedRooms);

        // Display the results.
        System.out.println("Total rooms: " + totalRooms);
        System.out.println("Occupied rooms: " + totalOccupiedRooms);
        System.out.println("Vacant rooms: " + totalVacantRooms);
        System.out.println("Occupancy rate: " + ((double)totalOccupiedRooms / totalRooms));
    }
}