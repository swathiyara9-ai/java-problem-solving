import java.util.*;

public class WeekdayWeekend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number = ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid day number");
        }

        sc.close();
    }
}