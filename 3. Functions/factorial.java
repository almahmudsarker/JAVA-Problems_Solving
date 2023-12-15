import java.util.Scanner;

public class factorial {
    public static void pintFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial of negative number is not possible");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pintFactorial(n);
    }
}
