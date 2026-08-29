import java.util.Scanner;

public class IncreasingDecreasing {

    static void printNumbers(int n, int current) {

        if (current > n) {
            return;
        }

        // Increasing
        System.out.print(current + " ");

        printNumbers(n, current + 1);

        // Decreasing
        System.out.print(current + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        printNumbers(n, 1);

        sc.close();
    }
}