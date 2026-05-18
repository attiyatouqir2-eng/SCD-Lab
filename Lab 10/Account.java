public class Account {
  private double balance;

  public Account(double initialBalance) {
    this.balance = initialBalance;
  }

  public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
    if (amount <= 0) {
      throw new InvalidAmountException("You cannot withdraw a negative amount.");
    }
    if (amount > balance) {
      throw new InsufficientFundsException("Insufficient funds! Your balance is: $" + balance);
    }
    balance = balance - amount;
    System.out.println("Withdrawal successful! New balance: $" + balance);
  }
}