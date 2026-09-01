import java.util.*;

public class CurrencyNotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount = ");
        int amount = sc.nextInt();

        if (amount % 2000 == 0 || amount % 500 == 0 || amount % 100 == 0) {
            System.out.println("Amount can be evenly divided");
        } else {
            System.out.println("Amount cannot be evenly divided");
        }

        sc.close();
    }
}