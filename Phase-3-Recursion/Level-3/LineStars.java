import java.util.Scanner;

public class LineStars {

    static void printStars(int n) {

        if (n == 0) {
            return;
        }

        System.out.print("* ");

        printStars(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        printStars(n);

        sc.close();
    }
}