import java.util.Scanner;

public class NumberPattern {

    static void printRow(int n) {

        if (n == 0) {
            return;
        }

        printRow(n - 1);
        System.out.print(n);
    }

    static void printPattern(int n) {

        if (n == 0) {
            return;
        }

        printPattern(n - 1);

        printRow(n);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        printPattern(n);

        sc.close();
    }
}