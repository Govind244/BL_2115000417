import java.util.*;

class Book {
    String title, author, genre;
    int bookID;
    boolean isAvailable;
    Book next, prev;

    Book(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class Library {
    Book head, tail;
    int count;

    void addBookAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        count++;
    }

    void addBookAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        count++;
    }

    void addBookAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
        if (position <= 1) {
            addBookAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }
        if (position > count) {
            addBookAtEnd(title, author, genre, bookID, isAvailable);
            return;
        }
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        Book temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        newBook.next = temp.next;
        newBook.prev = temp;
        temp.next.prev = newBook;
        temp.next = newBook;
        count++;
    }

    void removeBook(int bookID) {
        if (head == null) return;
        if (head.bookID == bookID) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            count--;
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp == tail) tail = temp.prev;
        count--;
    }

    void searchBook(String keyword) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | ID: " + temp.bookID + " | Available: " + temp.isAvailable);
            }
            temp = temp.next;
        }
    }

    void updateAvailability(int bookID, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | ID: " + temp.bookID + " | Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | ID: " + temp.bookID + " | Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    int totalBooks() {
        return count;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBookAtEnd("Book A", "Author A", "Fiction", 101, true);
        lib.addBookAtBeginning("Book B", "Author B", "Science", 102, false);
        lib.addBookAtPosition("Book C", "Author C", "History", 103, true, 2);
        lib.displayForward();
        System.out.println("Total Books: " + lib.totalBooks());
        lib.searchBook("Author A");
        lib.updateAvailability(101, false);
        lib.removeBook(102);
        lib.displayReverse();
    }
}