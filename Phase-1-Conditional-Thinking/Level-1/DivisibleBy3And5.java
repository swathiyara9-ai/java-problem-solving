import java.util.*;

public class DivisibleBy3And5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        sc.close();
    }
}