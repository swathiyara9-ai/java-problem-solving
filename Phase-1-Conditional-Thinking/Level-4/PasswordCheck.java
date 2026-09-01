import java.util.*;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password = ");
        String password = sc.nextLine();

        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (password.length() >= 8 && hasDigit) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}