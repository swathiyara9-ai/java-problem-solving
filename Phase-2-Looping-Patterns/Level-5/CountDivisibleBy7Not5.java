public class CountDivisibleBy7Not5 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}