public class Magazine extends Media {

    int issueNumber;
    String frequency;

    public Magazine(String title, String publisher, int issueNumber, String frequency) {
        super(title, publisher);
        this.issueNumber = issueNumber;
        this.frequency = frequency;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nMagazine Title: " + title + "\nPublisher: " + publisher + "\nIssue Number: " + issueNumber + "\nFrequency: " + frequency);
    }
}