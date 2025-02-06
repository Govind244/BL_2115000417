import java.util.ArrayList;
import java.util.List;

class Professor {
    private String professorName;

    public Professor(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorName() {
        return professorName;
    }
}

class AcademicDepartment {
    private String departmentName;
    private List<Professor> professors;

    public AcademicDepartment(String departmentName) {
        this.departmentName = departmentName;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Professors:");
        for (Professor professor : professors) {
            System.out.println(professor.getProfessorName());
        }
    }
}

class University {
    private String universityName;
    private List<AcademicDepartment> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(AcademicDepartment department) {
        departments.add(department);
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);
        for (AcademicDepartment department : departments) {
            department.displayDepartmentDetails();
        }
    }
}

public class UniversityDepartment {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");
        Professor prof3 = new Professor("Dr. Williams");

        AcademicDepartment department1 = new AcademicDepartment("Computer Science");
        department1.addProfessor(prof1);
        department1.addProfessor(prof2);

        AcademicDepartment department2 = new AcademicDepartment("Mathematics");
        department2.addProfessor(prof3);

        University university = new University("Tech University");
        university.addDepartment(department1);
        university.addDepartment(department2);

        university.displayUniversityDetails();
    }
}
