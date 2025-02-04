class Book {
    private static String libraryName = "City Library";
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
			System.out.println("\nDisplay Details: ");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        displayLibraryName();
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "978-0062315007");
        Book book2 = new Book("Atomic Habits", "James Clear", "978-0735211292");

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
