import java.util.*;

public class FirstLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number = ");
        int n = sc.nextInt();

        int first = n / 1000;
        int last = n % 10;

        if (first == last) {
            System.out.println("First and last digits are equal");
        } else {
            System.out.println("First and last digits are not equal");
        }

        sc.close();
    }
}