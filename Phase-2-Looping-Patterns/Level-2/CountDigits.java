import java.util.*;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        int count = 0;
        int temp = Math.abs(n);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}