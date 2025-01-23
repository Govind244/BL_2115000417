import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.printf("Average Marks: %.2f\n", totalMarks / 3);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

    }
}

