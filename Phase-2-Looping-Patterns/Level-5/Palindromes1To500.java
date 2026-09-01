public class Palindromes1To500 {
    public static void main(String[] args) {

        for (int n = 1; n <= 500; n++) {

            int temp = n;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (n == reverse) {
                System.out.print(n + " ");
            }
        }
    }
}