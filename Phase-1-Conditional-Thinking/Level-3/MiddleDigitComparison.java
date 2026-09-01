import java.util.*;

public class MiddleDigitComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3-digit number = ");
        int n = sc.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        if (b > a && b > c) {
            System.out.println("Middle digit is the largest");
        } else if (b < a && b < c) {
            System.out.println("Middle digit is the smallest");
        } else {
            System.out.println("Middle digit is neither largest nor smallest");
        }

        sc.close();
    }
}