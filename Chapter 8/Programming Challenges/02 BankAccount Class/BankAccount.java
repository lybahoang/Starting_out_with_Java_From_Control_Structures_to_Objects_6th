/**
    The BankAccount class simulates a bank account.
 */
public class BankAccount
{
    private double balance;     // Account balance.

    /**
        This constructor sets the starting balance at 0.0
     */
    public BankAccount()
    {
        balance = 0.0;
    }

    /**
        The copy constructor copies fields in another object into
        this object's fields
        @param anotherAccount The another object that this object is
                             going to copy its fields
     */
    public BankAccount(BankAccount anotherAccount) 
    {
        // Copy the balance field.
        this.balance = anotherAccount.balance;
    }

    /**
        This contructor sets the starting balance to the value
        passed as an argument
        @param startBalance The starting balance
     */
    public BankAccount(double startBalance)
    {
        balance = startBalance;
    }

    /**
        This constructor sets the starting balance to the value
        in the String argument
        @param str The starting balance, as a String
     */
    public BankAccount(String str)
    {
        balance = Double.parseDouble(str);
    }

    /**
        The deposit method makes a deposit into the account
        @param amount The amount to add to the balance field
     */
    public void deposit(double amount)
    {
        balance += amount;
    }

    /**
        The deposit method makes a deposit into the account
        @param str The amount to add to the balance field,
                   as a String
     */
    public void deposit(String str)
    {
        balance += Double.parseDouble(str);
    }

    /**
        The withdraw method withdraws an amount from the
        account
        @param amount The amount to subtract from the
                      balance account
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    /**
        The withdraw method withdraws an amount from the
        account
        @param str The amount to subtract from the balance
                   account as a String
     */
    public void withdraw(String str)
    {
        balance -= Double.parseDouble(str);
    }

    /**
        The setBalance method sets the account balance
        @param balance The value to store in the account balance.
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    /**
        The setBalance method sets the account balance
        @param balance The value, as a String, to store in the
                       balance field
     */
    public void setBalance(String balance)
    {
        this.balance = Double.parseDouble(balance);
    }

    /**
        The getBalance method retunrs the account balance.
        @return The value in the balance field
     */
    public double getBalance()
    {
        return balance;
    }
}