import java.util.*;

public class EvenOddDigitSumR {

    static void calculate(int n, int[] result) {

        if (n == 0) {
            return;
        }

        int digit = n % 10;

        if (digit % 2 == 0) {
            result[0] += digit;
        } else {
            result[1] += digit;
        }

        calculate(n / 10, result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int n = sc.nextInt();

        int[] result = new int[2];

        calculate(n, result);

        System.out.println("Even Digit Sum = " + result[0]);
        System.out.println("Odd Digit Sum = " + result[1]);

        sc.close();
    }
}