import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "Engineering", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 70000));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error serializing: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> deserializedEmployees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees:");
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing: " + e.getMessage());
        }
    }
}
