import java.util.*;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number = ");
        int month = sc.nextInt();

        if (month == 2) {
            System.out.println("28 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month >= 1 && month <= 12) {
            System.out.println("31 days");
        } else {
            System.out.println("Invalid month number");
        }

        sc.close();
    }
}