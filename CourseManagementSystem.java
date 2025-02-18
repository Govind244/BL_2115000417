import java.util.*;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics Exam"));
        examCourses.addCourse(new ExamCourse("Physics Exam"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Data Structures Assignment"));
        assignmentCourses.addCourse(new AssignmentCourse("Database Assignment"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research Paper"));
        researchCourses.addCourse(new ResearchCourse("Cybersecurity Research"));

        System.out.println("Exam Courses:");
        Course.displayAllCourses(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        Course.displayAllCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        Course.displayAllCourses(researchCourses.getCourses());
    }
}
