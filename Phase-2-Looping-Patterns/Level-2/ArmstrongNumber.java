import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}