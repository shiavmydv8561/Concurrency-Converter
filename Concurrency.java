import java.util.Scanner;

public class Concurrency {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
           
            double usdToInr = 83.12;
            double eurToInr = 90.45;
            double gbpToInr = 105.60;
            
            System.out.println("--- Currency Converter ---");
            System.out.println("Available conversions:");
            System.out.println("1. USD to INR");
            System.out.println("2. EUR to INR");
            System.out.println("3. GBP to INR");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();
            
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            
            double result;
            
            switch (choice) {
                case 1 -> {
                    result = amount * usdToInr;
                    System.out.println("$" + amount + " = ₹" + result);
                }
                case 2 -> {
                    result = amount * eurToInr;
                    System.out.println("€" + amount + " = ₹" + result);
                }
                case 3 -> {
                    result = amount * gbpToInr;
                    System.out.println("£" + amount + " = ₹" + result);
                }
                default -> System.out.println("Invalid option selected.");
            }
        }
    }
}
