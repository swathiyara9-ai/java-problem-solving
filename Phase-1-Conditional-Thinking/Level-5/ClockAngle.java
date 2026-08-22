import java.util.*;

public class ClockAngle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour = ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes = ");
        int minutes = sc.nextInt();

        if (hour < 0 || hour > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid time");
        } else {

            hour = hour % 12;

            double hourAngle = (hour * 30) + (minutes * 0.5);
            double minuteAngle = minutes * 6;

            double angle = Math.abs(hourAngle - minuteAngle);

            if (angle > 180) {
                angle = 360 - angle;
            }

            System.out.println("Smaller angle = " + angle);
        }

        sc.close();
    }
}