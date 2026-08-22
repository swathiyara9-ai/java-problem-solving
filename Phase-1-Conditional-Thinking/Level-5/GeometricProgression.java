import java.util.*;

public class GeometricProgression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        System.out.print("Enter c = ");
        int c = sc.nextInt();

        if (b * b == a * c) {
            System.out.println("Geometric Progression");
        } else {
            System.out.println("Not a Geometric Progression");
        }

        sc.close();
    }
}