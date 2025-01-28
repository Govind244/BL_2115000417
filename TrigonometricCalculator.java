import java.util.*;
public class TrigonometricCalculator {

    public static void calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);

        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);
        double secValue = 1 / cosValue;
        double cosecValue = 1 / sinValue;
        double cotValue = 1 / tanValue;

        System.out.println("Trigonometric values for " + angleInDegrees + "°:");
        System.out.println("Sin: " + sinValue);
        System.out.println("Cos: " + cosValue);
        System.out.println("Tan: " + tanValue);
        System.out.println("Sec: " + secValue);
        System.out.println("Cosec: " + cosecValue);
        System.out.println("Cot: " + cotValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        calculateTrigonometricFunctions(angleInDegrees);
    }
}
