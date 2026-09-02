import java.util.*;

public class RemoveDuplicatesR {

    static String removeDuplicates(String str, int i, String result) {

        if (i == str.length()) {
            return result;
        }

        char ch = str.charAt(i);

        if (result.indexOf(ch) == -1) {
            result += ch;
        }

        return removeDuplicates(str, i + 1, result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("String = ");
        String str = sc.nextLine();

        System.out.println("Final String = "
                + removeDuplicates(str, 0, ""));

        sc.close();
    }
}