class Book {
    public String ISBN;
    protected String title;
    private String author;
    
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

class EBook extends Book {
    
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "Java Programming", "John Doe");
        book.displayBookDetails();

        EBook eBook = new EBook("67890", "Advanced Java", "Jane Smith");
        eBook.displayEBookDetails();
    }
}
