import java.util.*;

public class ArithmeticProgression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        System.out.print("Enter c = ");
        int c = sc.nextInt();

        if (b - a == c - b) {
            System.out.println("Arithmetic Progression");
        } else {
            System.out.println("Not an Arithmetic Progression");
        }

        sc.close();
    }
}