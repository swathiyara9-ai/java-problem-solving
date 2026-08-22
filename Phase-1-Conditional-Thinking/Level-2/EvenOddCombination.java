import java.util.*;

public class EvenOddCombination {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = sc.nextInt();

        System.out.print("Enter second number = ");
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both are even");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both are odd");
        } else {
            System.out.println("One is even and one is odd");
        }

        sc.close();
    }
}