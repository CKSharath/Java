/*
   ABSTRACTION:
   Abstract class defines what every bank account
   should provide, without specifying every detail.
*/

abstract class BankAccount {

    /*
       ENCAPSULATION:
       Private variables cannot be directly accessed
       outside this class.
    */
    private String accountHolder;
    private double balance;

    // NEW: Static variable shared by all BankAccount objects
    static String bankName = "ABC Bank";

    /*
       CONSTRUCTOR:
       Initializes the account when an object is created.
    */
    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    // Public method to access account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public method to access balance
    public double getBalance() {
        return balance;
    }

    // Deposit money with validation
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // NEW: METHOD OVERLOADING
    // Same method name, but accepts an additional transaction note.
    public void deposit(double amount, String note) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Note: " + note);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw money with validation
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // ABSTRACTION:
    // Every account type must define its own interest.
    abstract double calculateInterest();
}


// NEW: INTERFACE
// Any class implementing AccountInfo must provide this method.
interface AccountInfo {
    void displayAccountType();
}


/*
   INHERITANCE:
   SavingsAccount inherits BankAccount.

   NEW: Also implements AccountInfo.
*/
class SavingsAccount extends BankAccount implements AccountInfo {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    /*
       POLYMORPHISM:
       Overriding parent's abstract method.
    */
    @Override
    double calculateInterest() {
        return getBalance() * 0.05;
    }

    // NEW: Implementing the interface method
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}


/*
   INHERITANCE:
   CurrentAccount also inherits BankAccount.

   NEW: Also implements AccountInfo.
*/
class CurrentAccount extends BankAccount implements AccountInfo {

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    /*
       POLYMORPHISM:
       Same method, different implementation.
    */
    @Override
    double calculateInterest() {
        return getBalance() * 0.02;
    }

    // NEW: Implementing the interface method
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Current Account");
    }
}


/*
   MAIN CLASS
*/
public class Main {

    public static void main(String[] args) {

        // OBJECTS + CONSTRUCTORS
        BankAccount account1 =
            new SavingsAccount("Rahul", 10000);

        BankAccount account2 =
            new CurrentAccount("Priya", 20000);

        // NEW: Accessing the static variable
        System.out.println("Bank: " + BankAccount.bankName);

        // ENCAPSULATION:
        // Access balance through controlled methods.
        account1.deposit(2000);
        account1.withdraw(1000);

        // NEW: Calling overloaded deposit method
        account1.deposit(500, "Birthday gift");

        /*
           POLYMORPHISM:
           Same method call, different account behaviour.
        */

        System.out.println(
            account1.getAccountHolder() +
            " Interest: " + account1.calculateInterest()
        );

        System.out.println(
            account2.getAccountHolder() +
            " Interest: " + account2.calculateInterest()
        );

        // NEW: INTERFACE REFERENCES
        AccountInfo info1 = new SavingsAccount("Rahul", 10000);
        AccountInfo info2 = new CurrentAccount("Priya", 20000);

        info1.displayAccountType();
        info2.displayAccountType();
    }
}

