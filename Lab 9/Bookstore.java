//It has "Code Smells": methods in the wrong place, exposed data, and unnecessary tiny methods.

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

    // This is the method to be INLINED later
    public boolean isSoldOut() {
        return quantity <= 0;
    }
}

class Customer {
    public String name;

    // CODE SMELL: Move Method needed. 
    // This method uses ONLY book data, so it belongs in the Book class.
    public double applyDiscount(Book book, double percentage) {
        return book.price - (book.price * percentage / 100);
    }
}

public class Bookstore {
    // CODE SMELL: Encapsulate Collection needed.
    // Anyone can bypass the system and clear this list.
    public List<Book> inventory = new ArrayList<>();

    public void displayInventory() {
        for (Book b : inventory) {
            // Using the tiny method
            if (b.isSoldOut()) {
                System.out.println(b.title + " is out of stock.");
            } else {
                System.out.println(b.title + " - $" + b.price);
            }
        }
    }
}