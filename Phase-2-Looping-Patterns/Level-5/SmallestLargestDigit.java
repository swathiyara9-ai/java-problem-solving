import java.util.*;

public class SmallestLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int smallest = 9;
        int largest = 0;

        if (n == 0) {
            smallest = 0;
            largest = 0;
        } else {
            while (n > 0) {
                int digit = n % 10;

                if (digit < smallest) {
                    smallest = digit;
                }

                if (digit > largest) {
                    largest = digit;
                }

                n = n / 10;
            }
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Largest digit = " + largest);

        sc.close();
    }
}