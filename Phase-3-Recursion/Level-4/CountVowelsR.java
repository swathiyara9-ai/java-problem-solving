import java.util.Scanner;

public class CountVowelsR {

    static int countVowels(String str, int index) {

        if (index == str.length()) {
            return 0;
        }

        char ch = str.charAt(index);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {

            return 1 + countVowels(str, index + 1);
        }

        return countVowels(str, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string = ");
        String str = sc.nextLine();

        System.out.println("Number of vowels = " + countVowels(str, 0));

        sc.close();
    }
}