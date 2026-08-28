import java.util.Scanner;

public class ProductOfNoR {

    static int check(int n) {

        if (n == 0) {
            return 1;
        }

        int digit = n % 10;

        return digit * check(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Product is 0");
        } else {
            System.out.println("Product of digits is " + check(n));
        }

        sc.close();
    }
}