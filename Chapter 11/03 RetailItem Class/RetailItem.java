/**
    The RetailItem class represents a retail item by holding its
    description, its number of units on hand, and its price.
 */
public class RetailItem
{
    private String description;     // The item's description.
    private int unitsOnHand;        // The number of units on hands.
    private double price;           // The item's price.

    /**
        The default constructor sets default values to all fields
     */
    public RetailItem()
    {
        this.description = "";
        this.unitsOnHand = 0;
        this.price = 0.0;
    }

    /**
        The constructor sets values to fields of the retail item
        @param description The description of the item
        @param units The units on hand of the item
        @param price The price of the item
        @exception NegativeUnit When unitsOnHand is negative
                   NegativePrice When price is negative
     */
    public RetailItem(String description, int units, double price) throws NegativeUnit, NegativePrice
    {
        // Set the description of the item.
        this.description = description;

        // Set the units on hands and throws an exception if needed.
        if (units < 0) throw new NegativeUnit(units);
        this.unitsOnHand = units;

        // Set the item's price and throw an exception if needed.
        if (price < 0) throw new NegativePrice(price);
        this.price = price;
    }

    /**
        The getDescription method returns the description of the item
        @return The value stored in the description field
     */
    public String getDescription()
    {
        return this.description;
    }

    /**
        The getUnitsOnHand method returns the number of units on hand
        of the item
        @return The value stored in the unitsOnHand field
     */
    public int getUnitsOnHand()
    {
        return this.unitsOnHand;
    }

    /**
        The getPrice method returns the price of the item
        @return The value stored in the price field
     */
    public double getPrice()
    {
        return this.price;
    }

    /**
        The setDescription method sets the description of the item
        @param description The description of the item
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
        The setUnitsOnHand method sets the number of units on hand
        of the item
        @param units The units on hand, as an int
        @exception NegativeUnit When units is negative
     */
    public void setUnitsOnHand(int units) throws NegativeUnit
    {
        if (units < 0) throw new NegativeUnit(units);
        this.unitsOnHand = units;
    }

    /**
        The setUnitsOnHand method sets the number of units on hand
        of the item
        @param unitsStr The units on hand, as a String
        @exception NegativeUnit When unitsStr contains negative value
                   NumberFormatException When unitsStr cannot be parsed
                                         as an integer.
     */
    public void setUnitsOnHand(String unitsStr) throws NegativeUnit, NumberFormatException
    {
        // Convert the string into an integer.
        int units = Integer.parseInt(unitsStr);

        // Throw an exception if the number of units is negative.
        if (units < 0) throw new NegativeUnit(units);

        // Otherwise, store the value in the unitsOnHand field.
        this.unitsOnHand = units;
    }

    /**
        The setPrice method sets the price of the item
        @param price The item's price, as a double
        @exception NegativePrice When price is negative
     */
    public void setPrice(double price) throws NegativePrice
    {
        if (price < 0) throw new NegativePrice(price);
        this.price = price;
    }

    /**
        The setPrice method sets the price of the item
        @param priceStr The item's price, as a String
        @exception NegativePrice When priceStr contain a negative value
                   NumberFormatException When priceStr cannot be parsed
                   as a double
     */
    public void setPrice(String priceStr) throws NegativePrice, NumberFormatException
    {
        // Convert the parameter into a double.
        double price = Double.parseDouble(priceStr);

        // Throw an exception if the price is negative.
        if (price < 0) throw new NegativePrice(price);

        // Otherwise, set the price of the item.
        this.price = price;
    }

    /**
        The toString method returns a string containing the information
        of the item
        @return A string that holds the item's data
     */
    public String toString()
    {
        // Create a String object to hold output.
        String output = "";

        // Create the content of the string.
        output += "Description: " + this.description +
                  "\nUnits on hand: " + this.unitsOnHand +
                  "\nPrice: $" + this.price;
                
        // Return the string.
        return output;
    }

    /**
        The displayInfo method displays the information of the item
     */
    public void displayInfo()
    {
        System.out.println("Description: " + this.description);
        System.out.println("Units on hand: " + this.unitsOnHand);
        System.out.println("Price: $" + this.price);
    }
}