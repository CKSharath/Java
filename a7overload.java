
class Calculator {

    // Method 1: Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Java selects method 1
        System.out.println(calc.add(10, 20));

        // Java selects method 2
        System.out.println(calc.add(10, 20, 30));

        // Java selects method 3
        System.out.println(calc.add(10.5, 20.5));
    }
}
