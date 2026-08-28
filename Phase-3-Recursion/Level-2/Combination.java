import java.util.Scanner;

public class Combination {

    static int nCr(int n, int r) {

        if (r == 0 || r == n) {
            return 1;
        }

        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        System.out.print("Enter r = ");
        int r = sc.nextInt();

        if (r < 0 || r > n) {
            System.out.println("Invalid values");
        } else {
            System.out.println("nCr = " + nCr(n, r));
        }

        sc.close();
    }
}