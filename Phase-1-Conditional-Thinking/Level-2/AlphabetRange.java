import java.util.*;

public class AlphabetRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character = ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("Between a and m");
        } else if (ch >= 'n' && ch <= 'z') {
            System.out.println("Between n and z");
        } else if (ch >= 'A' && ch <= 'M') {
            System.out.println("Between A and M");
        } else if (ch >= 'N' && ch <= 'Z') {
            System.out.println("Between N and Z");
        } else {
            System.out.println("Not an alphabet character");
        }

        sc.close();
    }
}