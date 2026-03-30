public class Main {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(7.0, "Attiya Touqir");
    BankAccount account2 = new BankAccount(1000.0, "Jaleel Haider");

    account1.deposit(700.0);
    account1.withdraw(500.0);
    account2.deposit(500.0);
    account2.withdraw(200.0);

    account1.displayAccountInfo();
    account2.displayAccountInfo();

    System.out.println(
        "Final Details of Account 1:" + account1.getAccountHolderName() + " - Balance: " + account1.getBalance());
    System.out.println(
        "Final Details of Account 2:" + account2.getAccountHolderName() + " - Balance: " + account2.getBalance());
  }
}
