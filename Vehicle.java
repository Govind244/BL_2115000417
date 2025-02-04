class Vehicle {
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;
    public static double registrationFee = 5000;

    public Vehicle(int registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("\nVehicle Details");
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(101, "John Doe", "Car");
        Vehicle vehicle2 = new Vehicle(102, "Jane Smith", "Bike");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        updateRegistrationFee(6000);

        System.out.println("\nAfter updating registration fee:\n");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
