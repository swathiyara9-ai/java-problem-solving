import java.util.*;

public class OddNumbersRecursion {

    static void printOdd(int n) {
        if (n == 0) {
            return;
        }

        printOdd(n - 1);

        if (n % 2 != 0) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        printOdd(n);

        sc.close();
    }
}