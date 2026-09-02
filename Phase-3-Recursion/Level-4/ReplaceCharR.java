import java.util.Scanner;

public class ReplaceCharR {

    static String replaceChar(String str, int i, char oldChar, char newChar) {

        if (i == str.length()) {
            return "";
        }

        char ch = str.charAt(i);

        if (ch == oldChar) {
            return newChar + replaceChar(str, i + 1, oldChar, newChar);
        }

        return ch + replaceChar(str, i + 1, oldChar, newChar);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string = ");
        String str = sc.nextLine();

        System.out.print("Enter character to replace = ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter replacement character = ");
        char newChar = sc.next().charAt(0);

        String result = replaceChar(str, 0, oldChar, newChar);

        System.out.println("Result = " + result);

        sc.close();
    }
}