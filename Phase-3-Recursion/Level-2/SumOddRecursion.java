import java.util.Scanner;

public class SumOddRecursion {

    static int sumOdd(int n) {

        if (n == 0) {
            return 0;
        }

        return (2 * n - 1) + sumOdd(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sumOdd(n));

        sc.close();
    }
}