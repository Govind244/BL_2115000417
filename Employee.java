class Employee {
    private static String companyName = "Solutions";
    private static int totalEmployees = 0;
    private String name;
    private String designation;
    private final String id;

    public Employee(String name, String designation, String id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
			System.out.println("\nDiplay Details: ");
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Employee ID: " + id);
        }
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee("John Doe", "Software Engineer", "EMP001");
        Employee emp2 = new Employee("Jane Smith", "Product Manager", "EMP002");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
		
		displayTotalEmployees();
    }
}
