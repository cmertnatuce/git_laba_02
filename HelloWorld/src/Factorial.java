public class FactorialCalculator {

    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void validateInput(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n > 20) {
            throw new IllegalArgumentException("Input too large - would cause overflow");
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial Calculator - Recursive");

        try {
            int number = 5;
            validateInput(number);
            long result = factorialRecursive(number);
            System.out.println(number + "! = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}