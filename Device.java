class Device {
    int deviceId;
    String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }

    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(101, "On", 24);
        thermostat.displayStatus();
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting + "°C");
    }
}
