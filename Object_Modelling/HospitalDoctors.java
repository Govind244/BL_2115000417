import java.util.*;

class Patient {
    String name;
    List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void consultDoctor(Doctor doctor) {
        doctors.add(doctor);
        doctor.addPatient(this);
    }

    public void showDoctors() {
        System.out.print(name + " consulted: ");
        for (Doctor doctor : doctors) {
            System.out.print(doctor.getName() + " ");
        }
        System.out.println();
    }
}

class Doctor {
    String name;
    List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void consult(Patient patient) {
        System.out.println(name + " is consulting " + patient.name);
    }

    public String getName() {
        return name;
    }

    public void showPatients() {
        System.out.print(name + " treated: ");
        for (Patient patient : patients) {
            System.out.print(patient.name + " ");
        }
        System.out.println();
    }
}

class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDetails() {
        System.out.println("Hospital: " + name);
        for (Doctor doctor : doctors) {
            doctor.showPatients();
        }
        for (Patient patient : patients) {
            patient.showDoctors();
        }
    }
}

public class HospitalDoctors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hospital name: ");
        String hospitalName = sc.nextLine();
        Hospital hospital = new Hospital(hospitalName);

        System.out.print("Enter number of doctors: ");
        int numDoctors = sc.nextInt();
        sc.nextLine();
        List<Doctor> doctorList = new ArrayList<>();

        for (int i = 0; i < numDoctors; i++) {
            System.out.print("Enter doctor name: ");
            String doctorName = sc.nextLine();
            Doctor doctor = new Doctor(doctorName);
            doctorList.add(doctor);
            hospital.addDoctor(doctor);
        }

        System.out.print("Enter number of patients: ");
        int numPatients = sc.nextInt();
        sc.nextLine();
        List<Patient> patientList = new ArrayList<>();

        for (int i = 0; i < numPatients; i++) {
            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();
            Patient patient = new Patient(patientName);
            patientList.add(patient);
            hospital.addPatient(patient);
        }

        for (Patient patient : patientList) {
            System.out.println("Assign doctors for " + patient.name);
            for (Doctor doctor : doctorList) {
                System.out.print("Consult " + doctor.getName() + "? (yes/no): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    patient.consultDoctor(doctor);
                    doctor.consult(patient);
                }
            }
        }

        hospital.showDetails();
    }
}
