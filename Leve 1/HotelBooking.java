import java.util.*;
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter guest name: ");
        String name = sc.nextLine();

        System.out.print("Enter room type (Standard/Deluxe/Suite): ");
        String roomType = sc.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking booking1 = new HotelBooking(name, roomType, nights);
        HotelBooking booking2 = new HotelBooking(booking1);
		HotelBooking booking3 = new	HotelBooking();
		
		System.out.println("\nDefault Booking:");
        booking3.displayBooking();
		
        System.out.println("\nOriginal Booking:");
        booking1.displayBooking();

        System.out.println("\nCloned Booking:");
        booking2.displayBooking();
    }
}
