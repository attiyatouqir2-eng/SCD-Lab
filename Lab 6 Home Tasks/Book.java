public class Book {

  private String title;
  private String author;
  private boolean isAvailable;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isAvailable = true;
  }

  public Book(String title) {
    this.title = title;
    this.author = "Unknown";
    this.isAvailable = true;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public boolean getIsAvailable() {
    return isAvailable;
  }

  public void borrowBook() {
    if (isAvailable) {
      isAvailable = false;
      System.out.println("Book borrowed: " + title);
    } else {
      System.out.println("Error: Book is already borrowed.");
    }
  }

  public void returnBook() {
    isAvailable = true;
    System.out.println("Book returned: " + title);
  }

  public void displayBookInfo() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Available: " + isAvailable);
  }
}