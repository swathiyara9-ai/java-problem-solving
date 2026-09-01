import java.util.*;

public class Cubes1ToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "³ = " + (i * i * i));
        }

        sc.close();
    }
}