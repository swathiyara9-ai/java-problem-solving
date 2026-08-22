import java.util.*;

public class CompareDates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (day month) = ");
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();

        System.out.print("Enter second date (day month) = ");
        int day2 = sc.nextInt();
        int month2 = sc.nextInt();

        if (month1 < month2 || (month1 == month2 && day1 < day2)) {
            System.out.println("First date comes first");
        } else if (month1 > month2 || (month1 == month2 && day1 > day2)) {
            System.out.println("Second date comes first");
        } else {
            System.out.println("Both dates are the same");
        }

        sc.close();
    }
}