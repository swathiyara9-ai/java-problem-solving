import java.util.*;

public class PositionDigitSumR {

    static void calculate(int n, int position, int[] result) {

        if (n == 0) {
            return;
        }

        int digit = n % 10;

        if (position % 2 == 0) {
            result[0] += digit;   // even position
        } else {
            result[1] += digit;   // odd position
        }

        calculate(n / 10, position + 1, result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int n = sc.nextInt();

        int[] result = new int[2];

        calculate(n, 1, result);

        System.out.println("Even Position Sum = " + result[0]);
        System.out.println("Odd Position Sum = " + result[1]);

        sc.close();
    }
}