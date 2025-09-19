/**
    Programming challenges 02: BankAccount class Copy Constructor.
 */
public class BankAccountDemo
{
    public static void main(String[] args)
    {
        // Create a BankAccount object with a starting balance
        // of 20000 dollars.
        BankAccount myAccount = new BankAccount(20000.0);

        // Create another BankAccount and copy myAccount into it.
        BankAccount anotherAccount = new BankAccount(myAccount);

        // Display the balances of the two accounts.
        System.out.println("My account: " + myAccount.getBalance());
        System.out.println("Another account: " + anotherAccount.getBalance());

        // Set the balance of anotherAccount to another value.
        anotherAccount.setBalance(90000.0);

        // Display the balances of the two accounts.
        System.out.println("\nMy account: " + myAccount.getBalance());
        System.out.println("Another account: " + anotherAccount.getBalance());
    }
}