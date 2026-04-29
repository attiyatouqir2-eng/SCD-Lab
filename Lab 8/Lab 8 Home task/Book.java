public class Book extends Media {
    
    String author;
    int pages;
    
    public Book(String title, String publisher, String author, int pages) {
        super(title, publisher);
        this.author = author;
        this.pages = pages;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("\nBook Title: " + title + "\nPublisher: " + publisher + "\nAuthor: " + author + "\nNumber of Pages: " + pages);
    }
}