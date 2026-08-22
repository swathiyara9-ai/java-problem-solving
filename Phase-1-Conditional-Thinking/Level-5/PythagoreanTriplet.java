import java.util.*;

public class PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        System.out.print("Enter c = ");
        int c = sc.nextInt();

        if (a * a + b * b == c * c ||
                b * b + c * c == a * a ||
                a * a + c * c == b * b) {

            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }

        sc.close();
    }
}