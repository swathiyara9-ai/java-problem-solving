import java.util.*;

public class SumOfDigitsRecursion {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        System.out.println("Sum of digits = " + sum(n));

        sc.close();
    }
}