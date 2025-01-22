import java.util.Scanner;

public class UserInputDistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println("The total miles is " + (km / 1.6) + " mile for the given " + km + " km");
        sc.close();
    }
}