
import java.util.*;
public class EuclideanDistance {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2];
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        lineEquation[0] = slope;
        lineEquation[1] = yIntercept;
        return lineEquation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];
        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", slope, yIntercept);
    }
}
