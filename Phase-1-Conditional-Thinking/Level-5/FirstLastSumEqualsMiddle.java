import java.util.*;

public class FirstLastSumEqualsMiddle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3-digit number = ");
        int n = sc.nextInt();

        int first = n / 100;
        int middle = (n / 10) % 10;
        int last = n % 10;

        if (first + last == middle) {
            System.out.println("Sum of first and last digit equals middle digit");
        } else {
            System.out.println("Sum does not equal middle digit");
        }

        sc.close();
    }
}