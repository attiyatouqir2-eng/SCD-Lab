import java.util.*;

class Book {
  public String title;
  public double price;
  public int quantity;

  public Book(String title, double price, int quantity) {
    this.title = title;
    this.price = price;
    this.quantity = quantity;
  }

  // CHANGE 2: MOVED METHOD from Customer class
  public double applyDiscount(double percentage) {
    return this.price - (this.price * percentage / 100);
  }
}

class Customer {
  public String name;
  // CHANGE 2: applyDiscount removed from here
}

public class RefactoredBookStore {
  // CHANGE 3: ENCAPSULATE COLLECTION - Made private
  private List<Book> inventory = new ArrayList<>();

  // Added controlled access methods for inventory
  public void addBook(Book book) {
    inventory.add(book);
  }

  public List<Book> getInventory() {
    return inventory;
  }

  public void displayInventory() {
    for (Book b : inventory) {
      // CHANGE 1: INLINED - direct check instead of isSoldOut()
      if (b.quantity <= 0) {
        System.out.println(b.title + " is out of stock.");
      } else {
        System.out.println(b.title + " - $" + b.price);
      }
    }
  }
}