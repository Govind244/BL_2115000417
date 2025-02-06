import java.util.*;

class Course {
    String courseName;
    List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void showStudents() {
        System.out.print("Course: " + courseName + " - Students: ");
        for (Student student : enrolledStudents) {
            System.out.print(student.getName() + " ");
        }
        System.out.println();
    }
}

class Student {
    String name;
    List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public void showCourses() {
        System.out.print(name + " is enrolled in: ");
        for (Course course : courses) {
            System.out.print(course.getCourseName() + " ");
        }
        System.out.println();
    }
}

class School {
    String name;
    List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            student.showCourses();
        }
    }
}

public class SchoolCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter school name: ");
        String schoolName = sc.nextLine();
        School school = new School(schoolName);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        List<Student> studentList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();
            Student student = new Student(studentName);
            studentList.add(student);
            school.addStudent(student);
        }

        System.out.print("Enter number of courses: ");
        int numCourses = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name: ");
            String courseName = sc.nextLine();
            courseList.add(new Course(courseName));
        }

        for (Student student : studentList) {
            System.out.println("Enroll courses for " + student.getName());
            for (Course course : courseList) {
                System.out.print("Enroll in " + course.getCourseName() + "? (yes/no): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    student.enroll(course);
                }
            }
        }

        school.showStudents();
        for (Course course : courseList) {
            course.showStudents();
        }
    }
}
