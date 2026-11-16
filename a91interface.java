
// Declaring an interface
interface Payment {

    // Abstract method
    void pay(double amount);
}

// Class 1 implements Payment
class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

// Class 2 implements Payment
class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

public class Main {

    public static void main(String[] args) {

        // Interface reference pointing to UPI object
        Payment p1 = new UPI();

        // Interface reference pointing to CreditCard object
        Payment p2 = new CreditCard();

        p1.pay(500);
        p2.pay(1000);
    }
}
