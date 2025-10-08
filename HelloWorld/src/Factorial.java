public class Factorial {

    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial Calculator - Recursive");

        int number = 5;
        long result = factorialRecursive(number);
        System.out.println(number + "! = " + result);
    }
}