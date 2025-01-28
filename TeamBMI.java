import java.util.*;
public class TeamBMI {

    public static double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (in kg) for member %d: ", i + 1);
            teamData[i][0] = scanner.nextDouble();
            System.out.printf("Enter height (in cm) for member %d: ", i + 1);
            teamData[i][1] = scanner.nextDouble();
        }
        
        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];
            double heightInCm = teamData[i][1];
            double bmi = calculateBMI(weight, heightInCm);
            teamData[i][2] = bmi;
        }
        
        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];
            double heightInCm = teamData[i][1];
            double bmi = teamData[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("Member %d: Weight=%.1f kg, Height=%.2f cm, BMI=%.2f, Status=%s%n", 
                              i + 1, weight, heightInCm, bmi, status);
        }
        
    }
}
