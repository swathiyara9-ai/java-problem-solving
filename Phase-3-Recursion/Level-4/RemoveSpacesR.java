import java.util.Scanner;

public class RemoveSpacesR {

    static String removeSpaces(String str, int i) {

        if (i == str.length()) {
            return "";
        }

        char ch = str.charAt(i);

        if (ch == ' ') {
            return removeSpaces(str, i + 1);
        }

        return ch + removeSpaces(str, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string = ");
        String str = sc.nextLine();

        System.out.println("After removing spaces = "
                + removeSpaces(str, 0));

        sc.close();
    }
}