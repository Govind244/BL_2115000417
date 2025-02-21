import java.io.*;

class Student {
    int rollNumber;
    String name;
    double gpa;

    Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }
}

public class StudentDataStream {
    public static void main(String[] args) {
        String fileName = "studentDetails.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            Student student1 = new Student(101, "Alice", 3.85);
            Student student2 = new Student(102, "Bob", 3.75);

            dos.writeInt(student1.rollNumber);
            dos.writeUTF(student1.name);
            dos.writeDouble(student1.gpa);

            dos.writeInt(student2.rollNumber);
            dos.writeUTF(student2.name);
            dos.writeDouble(student2.gpa);
        } catch (IOException e) {
            System.out.println("Error storing data: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
