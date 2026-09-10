import java.util.*;

public class ArmstrongR {

    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    static int armstrongSum(int n, int digits) {
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;

        return power(digit, digits)
                + armstrongSum(n / 10, digits);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int n = sc.nextInt();

        int digits = countDigits(n);
        int sum = armstrongSum(n, digits);

        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}