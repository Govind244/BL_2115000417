import java.time.*;

class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    int seatNumber;
    LocalDateTime bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, int seatNumber) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = LocalDateTime.now();
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket last;

    public TicketReservationSystem() {
        this.last = null;
    }

    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber);
        if (last == null) {
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
    }

    public boolean removeTicket(int ticketID) {
        if (last == null) {
            return false;
        }
        Ticket current = last.next, prev = last;
        do {
            if (current.ticketID == ticketID) {
                if (current == last && current.next == last) {
                    last = null;
                } else {
                    prev.next = current.next;
                    if (current == last) {
                        last = prev;
                    }
                }
                return true;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);
        return false;
    }

    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket current = last.next;
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName +
                    ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    public void searchTicket(String query) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket current = last.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(query) || current.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName +
                        ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);
        if (!found) {
            System.out.println("No matching ticket found.");
        }
    }

    public int countTickets() {
        if (last == null) {
            return 0;
        }
        int count = 0;
        Ticket current = last.next;
        do {
            count++;
            current = current.next;
        } while (current != last.next);
        return count;
    }

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(101, "John Doe", "Avengers", 5);
        system.addTicket(102, "Jane Smith", "Inception", 12);
        system.addTicket(103, "Alice Brown", "Avengers", 8);

        System.out.println("All Booked Tickets:");
        system.displayTickets();

        System.out.println("\nSearching for 'Avengers':");
        system.searchTicket("Avengers");

        System.out.println("\nTotal Tickets: " + system.countTickets());

        System.out.println("\nRemoving Ticket ID 102");
        system.removeTicket(102);

        System.out.println("\nAll Tickets after removal:");
        system.displayTickets();
    }
}
