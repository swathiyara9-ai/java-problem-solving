import java.util.*;

public class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = sc.nextInt();

        System.out.print("Enter second number = ");
        int b = sc.nextInt();

        int lcm;

        if (a > b) {
            lcm = a;
        } else {
            lcm = b;
        }

        while (lcm % a != 0 || lcm % b != 0) {
            lcm++;
        }

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}