public class Media {
    
    String title;
    String publisher;
    
    public Media(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title + "\nPublisher: " + publisher);
    }
}