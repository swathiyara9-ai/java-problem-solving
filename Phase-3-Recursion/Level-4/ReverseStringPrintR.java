import java.util.*;

public class ReverseStringPrintR {

    static void reverse(String str, int i) {

        if (i == str.length()) {
            return;
        }

        reverse(str, i + 1);

        System.out.print(str.charAt(i));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("String = ");
        String str = sc.nextLine();

        reverse(str, 0);

        sc.close();
    }
}