import java.util.*;

public class NumberDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        int num = Math.abs(n);

        if (num >= 0 && num <= 9) {
            System.out.println("Single-digit");
        } else if (num >= 10 && num <= 99) {
            System.out.println("Double-digit");
        } else {
            System.out.println("Multi-digit");
        }

        sc.close();
    }
}