import java.util.Scanner;

public class DecimalToBinary {

    static void binary(int n) {

        if (n == 0) {
            return;
        }

        binary(n / 2);

        System.out.print(n % 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Binary = 0");
        } else {
            System.out.print("Binary = ");
            binary(n);
        }

        sc.close();
    }
}