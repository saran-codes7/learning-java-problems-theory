import java.util.Scanner;

public class SuperMartBillingSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to SuperMart Billing System");
        
        System.out.print("Enter total number of items: ");
        int totalItems = sc.nextInt();
        
        System.out.print("Enter price per item: ");
        double pricePerItem = sc.nextDouble();
        
        double totalPrice = pricePerItem * totalItems;
        double discount = 0.0;
        double finalPrice = totalPrice;
        double tax = 0.0;
        
        if (totalItems >= 10) {
            discount = totalPrice * 0.10;
            finalPrice -= discount;
        }
        
        tax = finalPrice * 0.05;
        finalPrice += tax;
        
        System.out.println("\n--- Bill Summary ---");
        System.out.println("Total items purchased     : " + totalItems);
        System.out.println("Price per item            : " + pricePerItem);
        System.out.println("Subtotal                  : " + totalPrice);
        System.out.println("Discount (10%)            : " + discount);
        System.out.println("Tax (5%)                  : " + tax);
        System.out.println("Final Amount to Pay       : " + finalPrice);
        
        sc.close();
    }
}