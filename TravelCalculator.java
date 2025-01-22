import java.util.Scanner;

public class TravelCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traveler's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city : ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city: ");
        String finalCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToViaDistance = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + finalCity + " (in miles): ");
        double viaToFinalCityDistance = scanner.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (hours): ");
        int fromToViaHours = scanner.nextInt();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (minutes): ");
        int fromToViaMinutes = scanner.nextInt();

        System.out.print("Enter the time taken from " + viaCity + " to " + finalCity + " (hours): ");
        int viaToFinalCityHours = scanner.nextInt();

        System.out.print("Enter the time taken from " + viaCity + " to " + finalCity + " (minutes): ");
        int viaToFinalCityMinutes = scanner.nextInt();

        double totalDistance = fromToViaDistance + viaToFinalCityDistance;
        int totalHours = fromToViaHours + viaToFinalCityHours;
        int totalMinutes = fromToViaMinutes + viaToFinalCityMinutes;

        totalHours += totalMinutes / 60;
        totalMinutes %= 60;

        System.out.println("\n--- Travel Details ---");
        System.out.println("Traveler: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + finalCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalHours + " hours and " + totalMinutes + " minutes");

        scanner.close();
    }
}
