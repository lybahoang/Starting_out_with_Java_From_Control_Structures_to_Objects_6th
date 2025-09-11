/**
    The PersonalInformation class holds basic information about a person,
    which includes name, address, age, and phone number.
 */

public class PersonalInformation
{
    private String name;        // The person's name.
    private String address;     // The person's address.
    private int age;            // The person's age.
    private int phoneNumber;    // The person's phone number.

    /**
        Default constructor.
     */
    public PersonalInformation()
    {
        name = "";
        address = "";
        age = 0;
        phoneNumber = 0;
    }

    /**
        Constructor
        @param n The person's name.
        @param add The person's address.
        @param a The person's age.
        @param pNumber The person's phone number.
     */
    public PersonalInformation(String n, String add, int a, int pNumber)
    {
        name = n;
        address = add;
        age = a;
        phoneNumber = pNumber;
    }

    /**
        The getName method returns a person's name
        @return The value in the name field
     */
    public String getName()
    {
        return name;
    }

    /**
        The getAddress method returns a person's address
        @return The value in the address field
     */
    public String getAddress()
    {
        return address;
    }

    /**
        The getAge method returns a person's age
        @return The value in the age field
     */
    public int getAge()
    {
        return age;
    }

    /**
        The getPhoneNumber method returns a person's phone number
        @return The value in the phoneNumber field
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
        The setName function stores a value in the name field
        @param newName The person's name
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
        The setAddress function stores a value in the address field
        @param newAddress The person's address
     */
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }

    /**
        The setAge function stores a value in the age field
        @param newAge The person's age
     */
    public void setAge(int newAge)
    {
        age = newAge;
    }

    /**
        The setPhoneNumber function stores a value in the phoneNumber
        field
        @param newNumber The person's phone number
     */
    public void setPhoneNumber(int newNumber)
    {
        phoneNumber = newNumber;
    }
}