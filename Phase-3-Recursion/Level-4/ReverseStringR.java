import java.util.Scanner;

public class ReverseStringR {

    static String reverse(String str) {

        if (str.length() == 0) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string = ");
        String str = sc.nextLine();

        System.out.println("Reverse = " + reverse(str));

        sc.close();
    }
}