import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        double heightInMeters = heightInCm / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.printf("Your BMI is: %.1f\n", bmi);
        //  System.out.println("Your BMI is: " + String.format("%.1f", bmi));

        if (bmi <= 18.4) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a Normal weight.");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("You are Overweight.");
        } else if (bmi >= 40.0) {
            System.out.println("You are Obese.");
        }
    }
}

