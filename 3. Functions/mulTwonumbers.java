import java.util.Scanner;

public class mulTwonumbers {
    public static int calculateMul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = calculateMul(a, b);
        System.out.println("Multiply of 2 numbers is: " + mul);
    }
}
