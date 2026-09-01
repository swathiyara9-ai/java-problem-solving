import java.util.*;

public class ThirdAngle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle 1 = ");
        int a = sc.nextInt();

        System.out.print("Enter angle 2 = ");
        int b = sc.nextInt();

        int c = 180 - a - b;

        System.out.println("Third angle = " + c);

        sc.close();
    }
}