import java.util.*;  

abstract class LibraryItem {  
    private int itemId;  
    private String title;  
    private String author;  
    private boolean isAvailable = true;  

    public LibraryItem(int itemId, String title, String author) {  
        this.itemId = itemId;  
        this.title = title;  
        this.author = author;  
    }  

    public abstract int getLoanDuration();  

    public String getItemDetails() {  
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author + "\n";  
    }  

    public boolean isAvailable() {  
        return isAvailable;  
    }  

    public void setAvailability(boolean status) {  
        isAvailable = status;  
    }  
}  

interface Reservable {  
    void reserveItem();  
    boolean checkAvailability();  
}  

class Book extends LibraryItem implements Reservable {  
    public Book(int itemId, String title, String author) {  
        super(itemId, title, author);  
    }  

    public int getLoanDuration() {  
        return 14;  
    }  

    public void reserveItem() {  
        if (isAvailable()) {  
            setAvailability(false);  
            System.out.println("Book reserved successfully.\n");  
        } else {  
            System.out.println("Book is already reserved.\n");  
        }  
    }  

    public boolean checkAvailability() {  
        return isAvailable();  
    }  
}  

class Magazine extends LibraryItem implements Reservable {  
    public Magazine(int itemId, String title, String author) {  
        super(itemId, title, author);  
    }  

    public int getLoanDuration() {  
        return 7;  
    }  

    public void reserveItem() {  
        if (isAvailable()) {  
            setAvailability(false);  
            System.out.println("Magazine reserved successfully.\n");  
        } else {  
            System.out.println("Magazine is already reserved.\n");  
        }  
    }  

    public boolean checkAvailability() {  
        return isAvailable();  
    }  
}  

class DVD extends LibraryItem implements Reservable {  
    public DVD(int itemId, String title, String author) {  
        super(itemId, title, author);  
    }  

    public int getLoanDuration() {  
        return 5;  
    }  

    public void reserveItem() {  
        if (isAvailable()) {  
            setAvailability(false);  
            System.out.println("DVD reserved successfully.\n");  
        } else {  
            System.out.println("DVD is already reserved.\n");  
        }  
    }  

    public boolean checkAvailability() {  
        return isAvailable();  
    }  
}  

public class LibraryManagementSystem {  
    public static void main(String[] args) {  
        List<LibraryItem> catalog = new ArrayList<>();  

        LibraryItem book1 = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald");  
        LibraryItem magazine1 = new Magazine(201, "National Geographic", "Various Authors");  
        LibraryItem dvd1 = new DVD(301, "Inception", "Christopher Nolan");  

        catalog.add(book1);  
        catalog.add(magazine1);  
        catalog.add(dvd1);  

        for (LibraryItem item : catalog) {  
            System.out.println(item.getItemDetails());  
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days\n");  
        }  

        Reservable res1 = (Reservable) book1;  
        res1.reserveItem();  
        System.out.println("Availability: " + res1.checkAvailability() + "\n");  

        Reservable res2 = (Reservable) magazine1;  
        res2.reserveItem();  
        System.out.println("Availability: " + res2.checkAvailability() + "\n");  

        Reservable res3 = (Reservable) dvd1;  
        res3.reserveItem();  
        System.out.println("Availability: " + res3.checkAvailability() + "\n");  
    }  
}  
