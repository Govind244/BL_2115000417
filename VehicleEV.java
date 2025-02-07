interface Refuelable {
    void refuel();
}

class VehicleEV {
    String model;
    int maxSpeed;

    public VehicleEV(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }

    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250);

        ev.displayDetails();
        ev.charge();

        pv.displayDetails();
        pv.refuel();
    }
}

class ElectricVehicle extends VehicleEV {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends VehicleEV implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}
