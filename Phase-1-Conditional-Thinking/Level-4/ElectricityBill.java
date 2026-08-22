import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units = ");
        int units = sc.nextInt();

        double bill;

        // Example slab rates used for practice:
        // 0–100 units → ₹2/unit
        // 101–200 units → ₹3/unit
        // 201–300 units → ₹5/unit
        // Above 300 → ₹7/unit

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } else if (units <= 300) {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        } else {
            bill = (100 * 2) + (100 * 3) + (100 * 5) + ((units - 300) * 7);
        }

        System.out.println("Electricity Bill = ₹" + bill);

        sc.close();
    }
}