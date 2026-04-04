public class Lab6_Main {
  public static void main(String[] args) {

    Book book1 = new Book("Java Programming", "Attiya Touqir");
    Book book2 = new Book("Python Basics");

    book1.borrowBook(); // First time
    book1.borrowBook(); // Second time

    book1.returnBook();
    book1.borrowBook();

    System.out.println("\nBook 1 Details:");
    book1.displayBookInfo();

    System.out.println("\nBook 2 Details:");
    book2.displayBookInfo();
  }
}