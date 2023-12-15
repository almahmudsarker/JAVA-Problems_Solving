import java.util.*;

public class findInTwoDarrays {
    public static void main(String args[]) {
        System.out.println("Find a number in a 2D array");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];
        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int find = sc.nextInt();

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (numbers[i][j] == find) {
                    System.out.println("Found at (" + i + ", " + j + ")");
                    return;
                }
            }
        }
    }
}