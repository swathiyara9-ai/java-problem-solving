import java.util.*;

public class EvenBinaryOnes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        for (int num = 1; num <= n; num++) {

            int temp = num;
            int count = 0;

            while (temp > 0) {
                if (temp % 2 == 1) {
                    count++;
                }
                temp = temp / 2;
            }

            if (count % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}