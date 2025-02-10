import java.util.*;  

abstract class Patient {  
    private int patientId;  
    private String name;  
    private int age;  
    protected String diagnosis;  

    public Patient(int patientId, String name, int age, String diagnosis) {  
        this.patientId = patientId;  
        this.name = name;  
        this.age = age;  
        this.diagnosis = diagnosis;  
    }  

    public abstract double calculateBill();  

    public String getPatientDetails() {  
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + "\n";  
    }  
}  

interface MedicalRecord {  
    void addRecord(String record);  
    List<String> viewRecords();  
}  

class InPatient extends Patient implements MedicalRecord {  
    private int daysAdmitted;  
    private double dailyCharge;  
    private List<String> medicalRecords = new ArrayList<>();  

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {  
        super(patientId, name, age, diagnosis);  
        this.daysAdmitted = daysAdmitted;  
        this.dailyCharge = dailyCharge;  
    }  

    public double calculateBill() {  
        return daysAdmitted * dailyCharge;  
    }  

    public void addRecord(String record) {  
        medicalRecords.add(record);  
    }  

    public List<String> viewRecords() {  
        return medicalRecords;  
    }  
}  

class OutPatient extends Patient implements MedicalRecord {  
    private double consultationFee;  
    private List<String> medicalRecords = new ArrayList<>();  

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {  
        super(patientId, name, age, diagnosis);  
        this.consultationFee = consultationFee;  
    }  

    public double calculateBill() {  
        return consultationFee;  
    }  

    public void addRecord(String record) {  
        medicalRecords.add(record);  
    }  

    public List<String> viewRecords() {  
        return medicalRecords;  
    }  
}  

public class HospitalManagement {  
    public static void main(String[] args) {  
        Patient inPatient = new InPatient(101, "John Doe", 45, "Pneumonia", 5, 2000);  
        Patient outPatient = new OutPatient(102, "Jane Smith", 30, "Flu", 500);  

        System.out.println(inPatient.getPatientDetails());  
        System.out.println("Total Bill: ₹" + inPatient.calculateBill() + "\n");  

        System.out.println(outPatient.getPatientDetails());  
        System.out.println("Total Bill: ₹" + outPatient.calculateBill() + "\n");  

        MedicalRecord record1 = (MedicalRecord) inPatient;  
        record1.addRecord("Admitted to ICU on 5th Feb");  
        System.out.println("Medical Records: " + record1.viewRecords() + "\n");  

        MedicalRecord record2 = (MedicalRecord) outPatient;  
        record2.addRecord("Prescribed Antibiotics");  
        System.out.println("Medical Records: " + record2.viewRecords() + "\n");  
    }  
}  
