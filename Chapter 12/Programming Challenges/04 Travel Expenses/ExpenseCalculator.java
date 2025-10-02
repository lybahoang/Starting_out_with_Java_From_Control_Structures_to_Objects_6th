/**
    The ExpenseCalculator class calculates the total travel expenses
    of a business person on a trip.
 */

public class ExpenseCalculator
{
    // The following constants are used to represent the financial
    // support of the company for the person on a trip.
    private final double ALLOWANCE_PER_MEAL = 37.0;
    private final double PARKING_ALLOWANCE_PER_DAY = 10.00;
    private final double TAXI_ALLOWANCE_PER_DAY = 20.00;
    private final double LODGING_ALLOWANCE_PER_DAY = 95.00;
    private final double ALLOWANCE_PER_MILE = 0.27;

    // Private fields of the class.
    private int numOfDays;          // The number of days on the trup.
    private double airfare;         // Amount of airfare
    private double carRental;       // Amount of car rental fee.
    private double mileDriven;      // Number of miles driven.
    private double parkingFee;      // Amount of parking fee.
    private double taxiCharges;     // Amount of tax charges.
    private double registrationFee; // Amount of registration fee.
    private double lodgingCharges;  // Amount of lodging charges.

    /**
        The default constructor sets 0 for all fields.
     */
    public ExpenseCalculator()
    {
        numOfDays = 0;
        airfare = 0.0;
        carRental = 0.0;
        mileDriven = 0.0;
        parkingFee = 0.0;
        taxiCharges = 0.0;
        registrationFee = 0.0;
        lodgingCharges = 0.0;
    }

    /**
        The constructor sets up values for the fields.
     */
    public ExpenseCalculator(int days, double airfare, double carRental, double mileDriven,
    double parkingFee, double taxiCharges, double registrationFee, double lodgingCharges)
    {
        this.numOfDays = days;
        this.airfare = airfare;
        this.carRental = carRental;
        this.mileDriven = mileDriven;
        this.parkingFee = parkingFee;
        this.taxiCharges = taxiCharges;
        this.registrationFee = registrationFee;
        this.lodgingCharges = lodgingCharges;
    }

    /**
        The calculateTotalExpense method returns the actual total travel expense 
        of the business persion (not apply reimbursement yet).
        @return The actual total travel expense.
     */
    public double calculateTotalExpense()
    {
        return airfare + 
               carRental + 
               parkingFee + 
               taxiCharges + 
               registrationFee + 
               lodgingCharges;
    }

    /**
        The calculateMealAllowance method returns the amount of reimbursement for 
        meals for the trip.
        @return The allowance for meals.
     */
    public double calculateMealReimbursement()
    {
        return numOfDays * ALLOWANCE_PER_MEAL;
    }

    /**
        The calculateParkingAllowance method returns the amount of reimbursement
        for the parking fee for the trip.
        @return The allowance for parking fee.
     */
    public double calculateParkingAllowance()
    {
        return numOfDays * PARKING_ALLOWANCE_PER_DAY;
    }

    /**
        The calculateTaxiAllowance method returns the amount of reimbursement for
        the taxi charges for the trip.
        @return The allowance for taxi charges.
     */
    public double calculateTaxiAllowance()
    {
        return numOfDays * TAXI_ALLOWANCE_PER_DAY;
    }

    /**
        The calculateLodgingAllowance method returns the amount of reimbursement
        for the lodging charges for the trip.
        @return The allowance for lodging charges.
     */
    public double calculateLodgingAllowance()
    {
        return numOfDays * LODGING_ALLOWANCE_PER_DAY;
    }

    /**
        The calculatePrivateCarAllowance method returns the amount of reimbursement
        for the number of mile driven for the trip.
        @return The allowance for mile driven.
     */
    public double calculatePrivateCarAllowance()
    {
        return mileDriven * ALLOWANCE_PER_MILE;
    }

    /**
        The calculateTotalAllowance method returns the total amount of reimbursement
        for the trip.
        @return The total allowance for the trip.
     */
    public double calculateTotalAllowance()
    {
        return calculateMealReimbursement() +
               calculateParkingAllowance() +
               calculateTaxiAllowance() +
               calculateLodgingAllowance() +
               calculatePrivateCarAllowance();
    }

    /**
        The calculateExcessPaid method retuns the total amount of expenses that the
        person must pay himself/herself for the trip after applying reimbursement.
        @return The excess fee of the trip.
     */
    public double calculateExcessPaid()
    {
        // Calculate the excess amount.
        double excessPaid = calculateTotalExpense() - calculateTotalAllowance();

        // If the excess amount is greater than 0, then return the excess amount.
        if (excessPaid > 0)
        {
            return excessPaid;
        }
        // Otherwise, return 0 because no need to pay anything.
        else
        {
            return 0.0;
        }
    }

    /**
        The calculateSavedAmount method returns the total amount of money that 
        the person can save after the trip.
        @return The saved amount after the trip.
     */
    public double calculateSavedAmount()
    {
        // Calculate the saved amount.
        double saved = calculateTotalAllowance() - calculateTotalExpense();

        // If the saved amount is greater than 0, then return it.
        if (saved > 0)
        {
            return saved;
        }
        // Otherwise, return 0.0
        else
        {
            return 0.0;
        }
    }
}