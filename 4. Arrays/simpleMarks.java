import java.util.*;

public class simpleMarks {
    public static void main(String args[]) {
        // int marks[] = new int[3];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // int marks[] = { 10, 20, 30 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int marks[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }
    }
}