class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        displayDetails();
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee(101, "IT", 50000);
        emp.displayDetails();
        emp.modifySalary(55000);
        System.out.println("Updated Salary: 55000");
        
        Manager mgr = new Manager(102, "HR", 60000);
        mgr.displayManagerDetails();
    }
}
