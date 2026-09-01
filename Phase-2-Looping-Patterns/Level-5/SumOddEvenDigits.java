import java.util.*;

public class SumOddEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }

            n = n / 10;
        }

        System.out.println("Sum of even digits = " + evenSum);
        System.out.println("Sum of odd digits = " + oddSum);

        sc.close();
    }
}