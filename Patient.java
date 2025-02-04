class Patient {
    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    public static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("\nPatient Details");
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "Alice", 30, "Fever");
        Patient patient2 = new Patient(102, "Bob", 45, "Flu");

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        getTotalPatients();
    }
}
