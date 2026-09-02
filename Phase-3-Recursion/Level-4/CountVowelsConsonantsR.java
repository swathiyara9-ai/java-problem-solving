import java.util.*;

public class CountVowelsConsonantsR {

    static void count(String str, int i, int[] result) {

        if (i == str.length()) {
            return;
        }

        char ch = str.charAt(i);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {

            result[0]++;
        } 
        else if (ch >= 'a' && ch <= 'z') {

            result[1]++;
        }

        count(str, i + 1, result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("String = ");
        String str = sc.nextLine().toLowerCase();

        int[] result = new int[2];

        count(str, 0, result);

        System.out.println("Vowels = " + result[0]);
        System.out.println("Consonants = " + result[1]);

        sc.close();
    }
}