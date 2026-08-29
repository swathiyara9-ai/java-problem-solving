import java.util.Scanner;

public class TriangleStarsBottomUp {

    static void printRow(int n) {

        if (n == 0) {
            return;
        }

        System.out.print("* ");

        printRow(n - 1);
    }

    static void printTriangle(int n) {

        if (n == 0) {
            return;
        }

        printRow(n);
        System.out.println();

        printTriangle(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        printTriangle(n);

        sc.close();
    }
}