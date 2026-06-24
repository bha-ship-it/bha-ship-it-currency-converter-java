import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      Currency Converter");
        System.out.println("=================================");

        System.out.println("Available Currencies:");
        System.out.println("1. INR (Indian Rupee)");
        System.out.println("2. USD (US Dollar)");
        System.out.println("3. EUR (Euro)");

        System.out.print("\nSelect Base Currency (1-3): ");
        int baseCurrency = scanner.nextInt();

        System.out.print("Select Target Currency (1-3): ");
        int targetCurrency = scanner.nextInt();

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        // Convert base currency to INR first
        double amountInINR = 0;

        switch (baseCurrency) {
            case 1:
                amountInINR = amount;
                break;
            case 2:
                amountInINR = amount * 83.0; // 1 USD = 83 INR
                break;
            case 3:
                amountInINR = amount * 90.0; // 1 EUR = 90 INR
                break;
            default:
                System.out.println("Invalid Base Currency!");
                return;
        }

        // Convert INR to target currency
        double convertedAmount = 0;

        switch (targetCurrency) {
            case 1:
                convertedAmount = amountInINR;
                break;
            case 2:
                convertedAmount = amountInINR / 83.0;
                break;
            case 3:
                convertedAmount = amountInINR / 90.0;
                break;
            default:
                System.out.println("Invalid Target Currency!");
                return;
        }

        System.out.println("\n========== RESULT ==========");
        System.out.printf("Converted Amount: %.2f%n", convertedAmount);

        scanner.close();
    }
}
