import java.util.*;

public class ArithmeticProgression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a) = ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d) = ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n) = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = a + d;
        }

        sc.close();
    }
}