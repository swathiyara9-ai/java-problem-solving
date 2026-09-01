import java.util.*;

public class PrintCharactersR {

    static void printChars(String str, int i) {

        if (i == str.length()) {
            return;
        }

        System.out.println(str.charAt(i));

        printChars(str, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("String = ");
        String str = sc.nextLine();

        printChars(str, 0);

        sc.close();
    }
}