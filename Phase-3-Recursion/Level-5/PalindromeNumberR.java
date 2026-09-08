import java.util.*;

public class PalindromeNumberR {

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        int digit = n % 10;
        rev = rev * 10 + digit;

        return reverse(n / 10, rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int n = sc.nextInt();

        int original = n;
        int reversed = reverse(n, 0);

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}