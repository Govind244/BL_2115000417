class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 80000, 10);
        Employee developer = new Developer("Bob", 102, 60000, "Java");
        Employee intern = new Intern("Charlie", 103, 20000, 6);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration;

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Duration: " + duration + " months");
    }
}
