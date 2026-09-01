import java.util.*;

public class Squares1ToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "² = " + (i * i));
        }

        sc.close();
    }
}