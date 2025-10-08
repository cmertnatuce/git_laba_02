public class FactorialCalculator {

    // Iterative implementation
    public static long factorialIterative(int n) {
        validateInput(n);

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive implementation  
    public static long factorialRecursive(int n) {
        validateInput(n);
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Common validation method
    public static void validateInput(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n > 20) {
            throw new IllegalArgumentException("Input too large - would cause overflow");
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial Calculator - Both Implementations");

        try {
            int number = 5;

            long iterativeResult = factorialIterative(number);
            long recursiveResult = factorialRecursive(number);

            System.out.println("Iterative: " + number + "! = " + iterativeResult);
            System.out.println("Recursive: " + number + "! = " + recursiveResult);
            System.out.println("Results match: " + (iterativeResult == recursiveResult));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}