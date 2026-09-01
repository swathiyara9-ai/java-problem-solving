import java.util.*;

public class PointPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x = ");
        int x = sc.nextInt();

        System.out.print("Enter y = ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (y == 0) {
            System.out.println("X-axis");
        } else if (x == 0) {
            System.out.println("Y-axis");
        } else {
            System.out.println("Point is not on an axis");
        }

        sc.close();
    }
}