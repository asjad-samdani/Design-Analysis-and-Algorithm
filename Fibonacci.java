package TwoDArray;

public class Fibonacci {
    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;

        }
        int c = a + b;
        System.out.print(c+" ");
        fibonacci(b, c, n - 1);

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n = 10;

        fibonacci(a, b, n - 2);
        System.out.println();
    }

}
