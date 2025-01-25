import java.util.Scanner;
public class GradesAnother{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[][] marks = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Math: ");
            marks[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 3.0);

            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B+";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println();
        }

    }
}
