import java.util.Scanner;

public class PalindromeR {

    static int reverse(int rev, int n) {

        if (n == 0) {
            return rev;
        }

        int digit = n % 10;
        rev = rev * 10 + digit;

        return reverse(rev, n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int original = n;

        if (n < 0) {
            n = Math.abs(n);
        }

        int reversed = reverse(0, n);

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}