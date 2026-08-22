import java.util.*;

public class DivisibleBy5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }

        sc.close();
    }
}