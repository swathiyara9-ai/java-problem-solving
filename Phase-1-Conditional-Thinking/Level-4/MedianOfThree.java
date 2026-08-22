import java.util.*;

public class MedianOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        System.out.print("Enter c = ");
        int c = sc.nextInt();

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println("Median = " + a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println("Median = " + b);
        } else {
            System.out.println("Median = " + c);
        }

        sc.close();
    }
}