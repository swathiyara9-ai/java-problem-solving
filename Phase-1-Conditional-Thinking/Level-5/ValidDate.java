import java.util.*;

public class ValidDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day = ");
        int day = sc.nextInt();

        System.out.print("Enter month = ");
        int month = sc.nextInt();

        boolean valid = false;

        if (month >= 1 && month <= 12) {

            if (month == 2) {
                valid = day >= 1 && day <= 28;
            } else if (month == 4 || month == 6 ||
                    month == 9 || month == 11) {
                valid = day >= 1 && day <= 30;
            } else {
                valid = day >= 1 && day <= 31;
            }
        }

        if (valid) {
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid Date");
        }

        sc.close();
    }
}