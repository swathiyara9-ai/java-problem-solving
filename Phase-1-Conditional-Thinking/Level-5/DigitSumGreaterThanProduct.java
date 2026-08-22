import java.util.*;

public class DigitSumGreaterThanProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        int product = 1;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (sum > product) {
            System.out.println("Sum of digits is greater than product");
        } else {
            System.out.println("Sum of digits is not greater than product");
        }

        sc.close();
    }
}