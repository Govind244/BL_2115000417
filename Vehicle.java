class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {
    Vehicle car = new Car(200, "Petrol", 5);
    Vehicle truck = new Truck(120, "Diesel", 10000);
    Vehicle motorcycle = new Motorcycle(180, "Petrol", false);

    car.displayInfo();
    truck.displayInfo();
    motorcycle.displayInfo();
	}

}

class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Load Capacity: " + loadCapacity + " kg");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    public void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
