import java.util.Scanner;

public class GCDR {

    static int check(int num1, int num2) {

        int r = num1 % num2;

        if (r == 0) {
            return num2;
        }

        return check(num2, r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nums num1 and num2 = ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("GCD of number is " + check(num1, num2));

        sc.close();
    }
}