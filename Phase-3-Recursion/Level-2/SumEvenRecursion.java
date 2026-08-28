import java.util.Scanner;

public class SumEvenRecursion {

    static int sumEven(int n) {

        if (n == 0) {
            return 0;
        }

        return (2 * n) + sumEven(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sumEven(n));

        sc.close();
    }
}