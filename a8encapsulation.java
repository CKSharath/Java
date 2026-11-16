
class BankAccount {

    // Private: cannot be accessed directly
    private double balance = 10000;

    // Public method to check balance
    public double getBalance() {
        return balance;
    }

    // Controlled withdrawal
    public void withdraw(double amount) {

        // Validate before changing balance
        if (amount > 0 && amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawal successful!");

        } else {

            System.out.println("Invalid withdrawal!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // This is NOT allowed:
        // account.balance = 0;

        // This is allowed:
        account.withdraw(500);

        System.out.println(account.getBalance());
    }
}
