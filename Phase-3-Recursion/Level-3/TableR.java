import java.util.Scanner;

public class TableR {

    static void printTable(int n, int t) {

        if (t == 0) {
            return;
        }

        printTable(n, t - 1);

        System.out.println(n + " * " + t + " = " + (n * t));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        System.out.print("Enter t = ");
        int t = sc.nextInt();

        printTable(n, t);

        sc.close();
    }
}