import java.util.Scanner;

public class finalpayable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        double discount = 0;
        if (purchaseAmount < 500) {
            discount = 0;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 10;
        } else if (purchaseAmount > 1000) {
            discount = 20;
        }
        double discountAmount = (purchaseAmount * discount) / 100;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("Original purchase amount: " + purchaseAmount);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Final payable amount: " + finalAmount);

    }
}
