import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab10_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1000.00); 

        try {
            System.out.print("Withdraw amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numerical value.");
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction Session Ended.");
            scanner.close();
        }
    }
}