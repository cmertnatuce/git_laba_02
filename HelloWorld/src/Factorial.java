public class FactorialCalculator {

    public static long factorialIterative(int n) {
        validateInput(n);

        // Fix for n = 0
        if (n == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        validateInput(n);
        // Base case already handles n = 0 and n = 1 correctly
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
}