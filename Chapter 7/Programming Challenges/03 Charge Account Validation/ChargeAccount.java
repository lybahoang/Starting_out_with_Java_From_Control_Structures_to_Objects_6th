import java.util.ArrayList;
/**
    The ChargeAccount class holds an array of valid charge account number
    and provides a method to validate if an account number is valid.
 */
public class ChargeAccount
{
    private ArrayList<Integer> chargeAccountArray;

    /**
        The constructor intializes the chargeAccountArray
     */
    public ChargeAccount()
    {
        // Create an ArrayList object.
        chargeAccountArray = new ArrayList<Integer>();

        // Initialize the object.
        chargeAccountArray.add(5658845);
        chargeAccountArray.add(8080152);
        chargeAccountArray.add(1005231);
        chargeAccountArray.add(4520125);
        chargeAccountArray.add(4562555);
        chargeAccountArray.add(6545231);
        chargeAccountArray.add(7895122);
        chargeAccountArray.add(7895122);
        chargeAccountArray.add(3852085);
        chargeAccountArray.add(8777541);
        chargeAccountArray.add(5050552);
        chargeAccountArray.add(7576651);
        chargeAccountArray.add(8451277);
        chargeAccountArray.add(7825877);
        chargeAccountArray.add(7881200);
        chargeAccountArray.add(1302850);
        chargeAccountArray.add(1250255);
        chargeAccountArray.add(4581002);
    }

    /**
        The checkValidity method returns true if a charge account number is
        in the array. Otherwise, it returns false
        @param chargeNumber The charge account number
        @return True if chargeNumber is in the array or 
                False otherwise
     */
    public boolean checkValidity(int chargeNumber)
    {
        // A sequential search to validate the charge account number.
        for (int index = 0; index < chargeAccountArray.size(); index++)
        {
            if (chargeNumber == chargeAccountArray.get(index))
                return true;
        }

        // Otherwise, return false
        return false;
    }
}