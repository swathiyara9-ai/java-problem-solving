import java.util.Scanner;

public class CharacterPattern {

    static void printRow(int n, int current) {

        if (current > n) {
            return;
        }

        System.out.print((char) ('A' + current - 1));

        printRow(n, current + 1);
    }

    static void printPattern(int n, int row) {

        if (row > n) {
            return;
        }

        printRow(row, 1);
        System.out.println();

        printPattern(n, row + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        printPattern(n, 1);

        sc.close();
    }
}