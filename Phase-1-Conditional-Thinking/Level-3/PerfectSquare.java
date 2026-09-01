import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        boolean isPerfectSquare = false;

        if (n >= 0) {
            for (int i = 0; i * i <= n; i++) {
                if (i * i == n) {
                    isPerfectSquare = true;
                    break;
                }
            }
        }

        if (isPerfectSquare) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }

        sc.close();
    }
}