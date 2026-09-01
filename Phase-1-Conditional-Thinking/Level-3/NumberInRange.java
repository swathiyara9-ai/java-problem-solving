import java.util.*;

public class NumberInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        if (n >= 100 && n <= 999) {
            System.out.println("Number is within the range");
        } else {
            System.out.println("Number is outside the range");
        }

        sc.close();
    }
}