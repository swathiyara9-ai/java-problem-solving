import java.util.*;

public class AMorPM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour = ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes = ");
        int minutes = sc.nextInt();

        if (hour < 0 || hour > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid time");
        } else if (hour < 12) {
            System.out.println("AM");
        } else {
            System.out.println("PM");
        }

        sc.close();
    }
}