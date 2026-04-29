public class Lab8_Main {

    public static void main(String[] args) {

        Media[] library = new Media[3];

        library[0] = new Book("Software Risk Management", "Attiya Touqir", "Gohar Publishers", 380);

        library[1] = new Magazine("National Geographic", "National Geographic Society", 123, "Monthly");

        library[2] = new Book("Software Construction and Development", "Jaleel Haider", "Tech Press", 428);

        for (Media m : library) {
            m.displayDetails();
        }

    }
}