class Student {
    private String name;
    private final int rollNumber;
    private String grade;
    public static String universityName = "GLA University";
    private static int totalStudents = 0;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
			System.out.println("\nStudents Details: ");
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", "A");
        Student student2 = new Student(102, "Bob", "B");

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        displayTotalStudents();

        student1.updateGrade("A+");
        student2.updateGrade("B+");
        System.out.println("\nAfter updating grade:\n");
        student1.displayStudentDetails();
        student2.displayStudentDetails();		
    }
}
