public class PersonalInformationDemo 
{
    public static void main(String[] args)
    {
        // Create three PersonalInformation objects and initialize
        // the object with some data.
        PersonalInformation myFavoritePlayer = new PersonalInformation(
            "Kevin de Bruyne", "Ghent, Belgium", 34, 172025
        );

        PersonalInformation myInformation = new PersonalInformation();
        myInformation.setName("Ly Ba Hoang");
        myInformation.setAddress("Phuong Liet Ward, Hanoi, Vietnam");
        myInformation.setAge(19);
        myInformation.setPhoneNumber(920638);

        PersonalInformation myFriend = new PersonalInformation(
            "Quyen Linh", "Hoang Mai Ward, Hanoi, Vietnam", 20, 914810
        );

        // Display the information in the three objects.
        System.out.println("My favorite soccer player information: ");
        displayInformation(myFavoritePlayer);

        System.out.println("\nMy personal information: ");
        displayInformation(myInformation);

        System.out.println("\nMy friend information: ");
        displayInformation(myFriend);
    }

    /**
        The displayInformation function accepts a PersonalInformation object and
        displays the fields of the object on the screen
        @param obj The PersonalInformation object
     */
    public static void displayInformation(PersonalInformation obj)
    {
        System.out.println("Name: " + obj.getName());
        System.out.println("Address: " + obj.getAddress());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Phone number: " + obj.getPhoneNumber());
    }
}
