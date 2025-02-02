import java.util.*;
class BookBorrow {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public BookBorrow(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();

        BookBorrow book = new BookBorrow(title, author, price, true);

        System.out.println("\nBook Details:");
        book.displayBook();

        System.out.println("\nAttempting to borrow the book...");
        book.borrowBook();

        System.out.println("\nUpdated Book Details:");
        book.displayBook();
		book.borrowBook();
    }
}
