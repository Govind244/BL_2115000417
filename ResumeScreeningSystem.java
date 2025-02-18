import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void displayResume() {
        System.out.println("Processing resume for: " + jobRole.getRoleName());
    }
}

class ResumeScreening {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println("Screening resume for: " + role.getRoleName());
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(softwareEngineer);
        Resume<DataScientist> dataScientistResume = new Resume<>(dataScientist);
        Resume<ProductManager> productManagerResume = new Resume<>(productManager);

        softwareEngineerResume.displayResume();
        dataScientistResume.displayResume();
        productManagerResume.displayResume();

        List<JobRole> resumes = new ArrayList<>();
        resumes.add(softwareEngineer);
        resumes.add(dataScientist);
        resumes.add(productManager);

        ResumeScreening.processResumes(resumes);
    }
}
