import java.util.*;

public class ValidTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 = ");
        int a = sc.nextInt();

        System.out.print("Enter side 2 = ");
        int b = sc.nextInt();

        System.out.print("Enter side 3 = ");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }

        sc.close();
    }
}