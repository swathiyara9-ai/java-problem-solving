import java.util.*;

public class PointQuadrant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x = ");
        int x = sc.nextInt();

        System.out.print("Enter y = ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("First Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Second Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Third Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth Quadrant");
        } else {
            System.out.println("Point lies on an axis or at the origin");
        }

        sc.close();
    }
}