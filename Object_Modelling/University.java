import java.util.*;

class Course {
    String courseName;
    Professor professor;
    List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "Not Assigned"));
        System.out.print("Students: ");
        for (Student student : students) {
            System.out.print(student.name + " ");
        }
        System.out.println("\n");
    }
}

class Student {
    String name;
    List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showCourses() {
        System.out.print(name + " is enrolled in: ");
        for (Course course : courses) {
            System.out.print(course.courseName + " ");
        }
        System.out.println();
    }
}

class Professor {
    String name;
    List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    public void showCourses() {
        System.out.print(name + " teaches: ");
        for (Course course : courses) {
            System.out.print(course.courseName + " ");
        }
        System.out.println();
    }
}

public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            students.add(new Student(sc.nextLine()));
        }

        System.out.print("Enter number of professors: ");
        int numProfessors = sc.nextInt();
        sc.nextLine();
        List<Professor> professors = new ArrayList<>();

        for (int i = 0; i < numProfessors; i++) {
            System.out.print("Enter professor name: ");
            professors.add(new Professor(sc.nextLine()));
        }

        System.out.print("Enter number of courses: ");
        int numCourses = sc.nextInt();
        sc.nextLine();
        List<Course> courses = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name: ");
            courses.add(new Course(sc.nextLine()));
        }

        for (Student student : students) {
            System.out.println("Enroll courses for " + student.name);
            for (Course course : courses) {
                System.out.print("Enroll in " + course.courseName + "? (yes/no): ");
                if (sc.nextLine().equalsIgnoreCase("yes")) {
                    student.enrollCourse(course);
                }
            }
        }

        for (Professor professor : professors) {
            System.out.println("Assign courses for " + professor.name);
            for (Course course : courses) {
                System.out.print("Assign " + course.courseName + "? (yes/no): ");
                if (sc.nextLine().equalsIgnoreCase("yes")) {
                    professor.assignCourse(course);
                }
            }
        }

        System.out.println("\nUniversity System Overview:");
        for (Student student : students) {
            student.showCourses();
        }
        for (Professor professor : professors) {
            professor.showCourses();
        }
        for (Course course : courses) {
            course.showCourseDetails();
        }
    }
}
