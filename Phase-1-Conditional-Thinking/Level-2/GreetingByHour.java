import java.util.*;

public class GreetingByHour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour = ");
        int hour = sc.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour");
        } else if (hour < 12) {
            System.out.println("Good Morning");
        } else if (hour < 17) {
            System.out.println("Good Afternoon");
        } else if (hour < 21) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }

        sc.close();
    }
}