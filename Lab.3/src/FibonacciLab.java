

public class FibonacciLab {

    public static int fib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("Mohanad Alsulamiani\n 44712779\n-------------------");

        System.out.println("fib(0) = " + fib(0));
        System.out.println("fib(1) = " + fib(1));
        System.out.println("fib(5) = " + fib(5));
        System.out.println("fib(6) = " + fib(6));


    }
}