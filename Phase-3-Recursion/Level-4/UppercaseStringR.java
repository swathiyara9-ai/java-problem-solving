import java.util.*;

public class UppercaseStringR {

    static String convert(String str, int i) {

        if (i == str.length()) {
            return "";
        }

        char c = str.charAt(i);

        return Character.toUpperCase(c) + convert(str, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("String = ");
        String str = sc.nextLine();

        System.out.println("Uppercase = " + convert(str, 0));

        sc.close();
    }
}