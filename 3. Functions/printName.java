import java.util.*;

public class printName {
    public static void printMyName(String name) {
        System.out.println("Hello " + name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
    }
}