import java.util.*;

public class MultipleOf7OrEnds7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        if (n % 7 == 0 || n % 10 == 7) {
            System.out.println("Multiple of 7 or ends with 7");
        } else {
            System.out.println("Neither a multiple of 7 nor ends with 7");
        }

        sc.close();
    }
}