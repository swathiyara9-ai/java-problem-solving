import java.util.Scanner;

public class ReverseTriangle {

    static void printRow(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        printRow(n - 1);
    }

    static void printPattern(int n) {

        if (n == 0) {
            return;
        }

        printRow(n);
        System.out.println();

        printPattern(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        printPattern(n);

        sc.close();
    }
}