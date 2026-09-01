import java.util.*;

public class SkipZeroSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number = ");
            int n = sc.nextInt();

            if (n == 0) {
                continue;
            }

            sum = sum + n;
        }

        System.out.println("Sum of non-zero numbers = " + sum);

        sc.close();
    }
}