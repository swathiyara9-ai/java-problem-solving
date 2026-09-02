import java.util.*;

public class RemoveOccurenceR {

    static String check(String str, int i, char ch) {
        if (i == str.length()) {
            return "";
        }

        char c = str.charAt(i);

        if (c == ch) {
            return check(str, i + 1, ch);
        }

        return c + check(str, i + 1, ch);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("String = ");
        String str = sc.nextLine();

        System.out.print("Ch = ");
        char ch = sc.next().charAt(0);

        System.out.println("Final String = " + check(str, 0, ch));

        sc.close();
    }
}