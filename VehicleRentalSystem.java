import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private final String vehicleNumber;
    private final String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void setRentalRate(double rentalRate) {
        if (rentalRate > 0) {
            this.rentalRate = rentalRate;
        } else {
            System.out.println("Rental rate must be positive!");
        }
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    private final String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }
}

class Truck extends Vehicle implements Insurable {
    private final String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% extra charge for trucks
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.08;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("C123", 1000, "CAR-INS-001");
        Bike bike = new Bike("B456", 500);
        Truck truck = new Truck("T789", 2000, "TRUCK-INS-002");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                double insuranceCost = ((Insurable) vehicle).calculateInsurance();
                System.out.println("Insurance Cost: " + insuranceCost);
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }

            System.out.println("\n");
        }
    }
}
