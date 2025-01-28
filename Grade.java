import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);

        scanner.close();
    }

    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            results[i][0] = total;
            results[i][1] = (double) total / 3;
            results[i][2] = (double) total / 300 * 100;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.printf("%.2f\t", results[i][0]);
            System.out.printf("%.2f\t", results[i][1]);
            System.out.printf("%.2f\t", results[i][2]);
            System.out.print(getGrade((int) Math.round(results[i][2])) + "\t");
            System.out.println(getRemarks((int) Math.round(results[i][2])));
        }

        System.out.println("--------------------------------------------------------------------");
    }

    public static String getGrade(int percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static String getRemarks(int percentage) {
        String grade = getGrade(percentage);
        switch (grade) {
            case "A":
                return "(Level 4, above agency-normalized standards)";
            case "B":
                return "(Level 3, at agency-normalized standards)";
            case "C":
                return "(Level 2, below, but approaching agency-normalized standards)";
            case "D":
                return "(Level 1, well below agency-normalized standards)";
            case "E":
                return "(Level 1-, too below agency-normalized standards)";
            case "R":
                return "(Remedial standards)";
            default:
                return "";
        }
    }
}
