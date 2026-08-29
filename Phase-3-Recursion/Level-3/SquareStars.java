import java.util.Scanner;

public class SquareStars {

    static void printRow(int n) {

        if (n == 0) {
            return;
        }

        System.out.print("* ");

        printRow(n - 1);
    }

    static void printSquare(int n, int row) {

        if (row == 0) {
            return;
        }

        printRow(n);
        System.out.println();

        printSquare(n, row - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        printSquare(n, n);

        sc.close();
    }
}