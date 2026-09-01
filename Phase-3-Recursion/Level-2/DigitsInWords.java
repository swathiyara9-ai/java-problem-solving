import java.util.Scanner;

public class DigitsInWords {

    static void printWords(int n) {

        if (n == 0) {
            return;
        }

        printWords(n / 10);

        int digit = n % 10;

        switch (digit) {
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Zero");
        } else {
            printWords(n);
        }

        sc.close();
    }
}