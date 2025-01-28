public class UnitConverter {

    public static double convertKmToMiles(double km) {
        final double KM_TO_MILES = 0.621371;
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        final double MILES_TO_KM = 1.60934;
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        final double METERS_TO_FEET = 3.28084;
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        final double FEET_TO_METERS = 0.3048;
        return feet * FEET_TO_METERS;
    }

    public static void main(String[] args) {
        double km = 10;     // Example value in kilometers
        double miles = 6.2; // Example value in miles
        double meters = 5;  // Example value in meters
        double feet = 16.4; // Example value in feet

        System.out.println(km + " kilometers is equal to " + convertKmToMiles(km) + " miles.");
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");
    }
}
