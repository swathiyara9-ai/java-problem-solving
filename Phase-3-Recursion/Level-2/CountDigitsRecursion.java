import java.util.Scanner;

public class CountDigitsRecursion {

    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Number of digits = 1");
        } else {
            n = Math.abs(n);
            System.out.println("Number of digits = " + countDigits(n));
        }

        sc.close();
    }
}