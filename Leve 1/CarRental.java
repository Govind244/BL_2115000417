import java.util.*;
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 1000.0;
    }

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Enter rental days: ");
        int rentalDays = scanner.nextInt();

        System.out.print("Enter daily rental rate: ");
        double dailyRate = scanner.nextDouble();

        CarRental rental = new CarRental(name, carModel, rentalDays, dailyRate);

        System.out.println("\nRental Details:");
        rental.displayRentalDetails();
    }
}
