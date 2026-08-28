import java.util.Scanner;

public class ReverseNoR {

    static int check(int rev, int n) {

        if (n == 0) {
            return rev;
        }

        int digit = n % 10;
        rev = rev * 10 + digit;

        return check(rev, n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Reverse is 0");
        } else {
            System.out.println("Reverse of number is " + check(0, n));
        }

        sc.close();
    }
}