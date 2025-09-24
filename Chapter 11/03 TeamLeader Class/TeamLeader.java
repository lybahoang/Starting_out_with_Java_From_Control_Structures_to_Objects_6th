/**
    The TeamLeader class extends the ProductionWorker class and has
    it own specialized fields including monthly bonus, the required
    number of training hours, and the number of training hours
    attended.
 */
public class TeamLeader extends ProductionWorker
{
    private double monthlyBonus;    // The team leader's monthly bonus.
    private double requiredTrainingHours;   // The required number of 
                                            // training hours.
    private double attendedTrainingHours;   // The number of training
                                            // hours attended.

    /**
        The default constructor sets default values to fields and
        calls the default constructor fo the superclass
     */
    public TeamLeader()
    {
        // Call the superclass's default constructor.
        super();

        // Sets default values to other fields.
        this.monthlyBonus = 0.0;
        this.requiredTrainingHours = 0.0;
        this.attendedTrainingHours = 0.0;
    }

    /**
        The constructor sets values to fields and calls the superclass's
        constructor
        @param name The team leader's name
        @param number The team leader's number
        @param date The team leader's hire date
        @param shift The team leader's shift
        @param payRate The team leader's hourly pay rate
        @param bonus The team leader's monthly bonus
        @param requiredHours The team leader's required number of training
                             hours
        @param attendedHours The number of training hours that the team leader
                             has attended
     */
    public TeamLeader(String name, String number, String date, int shift,
    double payRate, double bonus, double requiredHours, double attendedHours)
    {
        // Call the superclass's constructor.
        super(name, number, date, shift, payRate);

        // Sets values to other fields.
        this.monthlyBonus = bonus;
        this.requiredTrainingHours = requiredHours;
        this.attendedTrainingHours = attendedHours;
    }

    /**
        The getMonthlyBonus method returns the monthly bonus of the
        team leader
        @return The value stored in the monthlyBonus field
     */
    public double getMonthlyBonus()
    {
        return monthlyBonus;
    }

    /**
        The getRequiredTrainingHours method returns the required number
        of training hours of the team leader
        @return The value stored in the requiredTrainingHours field
     */
    public double getRequiredTrainingHours()
    {
        return requiredTrainingHours;
    }

    /**
        The getAttendedTrainingHours method returns the number of training
        hours that the team leader has attended
        @return The value stored in the attendedTrainingHours field
     */
    public double getAttendedTrainingHours()
    {
        return attendedTrainingHours;
    }

    /**
        The setMonthlyBonus method sets the monthly bonus of the team leader
        @param bonus The team leader's monthly bonus, as a double
     */
    public void setMonthlyBonus(double bonus)
    {
        this.monthlyBonus = bonus;
    }

    /**
        The setMonthlyBonus method sets the monthly bonus of the team leader
        @param bonus The team leader's month bonus, as a String
     */
    public void setMonthlyBonus(String bonus)
    {
        this.monthlyBonus = Double.parseDouble(bonus);
    }

    /**
        The setRequiredTrainingHours method sets the required number of
        training hours of the team leader
        @param hours The required hours of training, as a double
     */
    public void setRequiredTrainingHours(double hours)
    {
        this.requiredTrainingHours = hours;
    }

    /**
        The setRequiredTrainingHours method sets the required number of
        training hours of the team leader
        @param hours The required hours of training, as a String
     */
    public void setRequiredTrainingHours(String hours)
    {
        this.requiredTrainingHours = Double.parseDouble(hours);
    }

    /**
        The setAttendedTrainingHours method sets the number of training
        hours that the team leader has attended
        @param hours The hours of training attended by the team leader
     */
    public void setAttendedTrainingHours(double hours)
    {
        this.attendedTrainingHours = hours;
    }

    /**
        The setAttendedTrainingHours method sets the number of training
        hours that the team leader has attended
        @param hours The hours of training attended by the team leader
     */
    public void setAttendedTrainingHours(String hours)
    {
        this.attendedTrainingHours = Double.parseDouble(hours);
    }

    /**
        The toString method returns a String object that holds the team
        leader's information
        @return A string containing the team leader's information
     */
    @Override
    public String toString()
    {
        // Create a String object to hold the output string.
        String outputString = "";

        // Create a String to hold the information of the team leader.
        outputString += super.toString();
        outputString += "\nMonthly bonus: $" + monthlyBonus;
        outputString += "\nRequired training hours: " + requiredTrainingHours;
        outputString += "\nTraining hours attended: " + attendedTrainingHours;

        // Return the output string.
        return outputString;
    }
}