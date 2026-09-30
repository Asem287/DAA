public class Fibonacci {

    // Recusive method to find n-fibonacci number
    public static int fibonacci(int n) {
        if (n <= 0)
            return 0; // case 1
        if (n == 1)
            return 1; // case 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
    }

    public static void main(String[] args) {
        // 3 examples
        System.out.println("Fibonacci(4) = " + fibonacci(4));
        System.out.println("Fibonacci(5) = " + fibonacci(5));
        System.out.println("Fibonacci(6) = " + fibonacci(6));
    }
}