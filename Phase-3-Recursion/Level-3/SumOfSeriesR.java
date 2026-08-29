import java.util.Scanner;

public class SumOfSeriesR {

    static void printEach(int n, int current, int sum) {

        if (current > n) {
            return;
        }

        sum += current;

        System.out.println("Sum up to " + current + " = " + sum);

        printEach(n, current + 1, sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid");
        } else {
            printEach(n, 1, 0);
        }

        sc.close();
    }
}