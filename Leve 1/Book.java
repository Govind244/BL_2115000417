import java.util.*;
class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Default";
        this.author = "BridgeLabz";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs " + price);
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Title: ");
		String title = sc.nextLine();
        
		System.out.println("Enter the Author: ");
		String author = sc.nextLine();
		
		System.out.println("Enter the Price: ");	
		double price = sc.nextDouble();

		System.out.println("\nDefault Constructor's values: ");
		Book book1 = new Book();
		System.out.println("\nParameterised Constructor's values: ");
        Book book2 = new Book(title, author, price);
		
        book1.display();
        book2.display();
    }
}
