import java.util.*;

public class ProductDigitsR {

    static int product(int n) {

        if (n == 0) {
            return 1;
        }

        int digit = n % 10;

        return digit * product(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int n = sc.nextInt();

        System.out.println("Product = " + product(n));

        sc.close();
    }
}