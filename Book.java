class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }

    public static void main(String[] args) {
        Author author = new Author("Java Programming", 2020, "John Doe", "Expert in Java and software development.");
        author.displayInfo();
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear + ", Author: " + name + ", Bio: " + bio);
    }
}
