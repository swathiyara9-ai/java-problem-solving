import java.util.*;

public class PositiveSumLessThan100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = sc.nextInt();

        System.out.print("Enter second number = ");
        int b = sc.nextInt();

        if (a > 0 && b > 0 && a + b < 100) {
            System.out.println("Both are positive and their sum is less than 100");
        } else {
            System.out.println("Condition not satisfied");
        }

        sc.close();
    }
}