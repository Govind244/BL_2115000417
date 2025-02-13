public class CircularTour {

    public static int findStartingPump(int[] petrol, int[] distance) {
        int start = 0; 
        int totalSurplus = 0; 
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalSurplus += petrol[i] - distance[i];

            if (totalSurplus < 0) {
                deficit += totalSurplus; 
                start = i + 1; 
                totalSurplus = 0; 
            }
        }

        return (totalSurplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int result = findStartingPump(petrol, distance);
        System.out.println(result == -1 ? "No Solution" : "Start at pump: " + result);
    }
}