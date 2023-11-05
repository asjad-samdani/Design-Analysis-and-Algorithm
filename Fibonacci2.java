package TwoDArray;

//Fibonacci using Non Recurursion

public class Fibonacci2 {
    public static void main(String[] args) {
        int a = 0, b = 1, n = 10;
        System.out.println("Fibonacci series till " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ",");
            // compare the next term
            int c = a + b;
            a = b;
            b = c;

        }
        System.out.println();

    }

}