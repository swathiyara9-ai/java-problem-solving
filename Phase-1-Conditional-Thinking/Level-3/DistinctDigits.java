import java.util.*;

public class DistinctDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3-digit number = ");
        int n = sc.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        if (a != b && b != c && a != c) {
            System.out.println("All digits are distinct");
        } else {
            System.out.println("Digits are not distinct");
        }

        sc.close();
    }
}