import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private final String vehicleId;
    private final String driverName;
    private final double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm + "\n");
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // Additional base fare for cars
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Car location updated to: " + newLocation + "\n");
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // No extra charge for bikes
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Bike location updated to: " + newLocation + "\n");
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // Small base fare for autos
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Auto location updated to: " + newLocation + "\n");
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("C101", "Alice", 15, "Downtown");
        Bike bike = new Bike("B202", "Bob", 8, "City Center");
        Auto auto = new Auto("A303", "Charlie", 10, "Suburbs");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double rideDistance = 10; // Example distance

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            double fare = vehicle.calculateFare(rideDistance);
            System.out.println("Fare for " + rideDistance + " km: " + fare + "\n");

            if (vehicle instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation() + "\n");
                ((GPS) vehicle).updateLocation("New Destination");
            }
            System.out.println("\n");
        }
    }
}
