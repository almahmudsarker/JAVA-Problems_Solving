import java.util.*;

public class findNumbers {
    public static void main(String args[]) {
        System.out.println("This Linear Search");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Number found at index " + i);
            }
        }
    }
}