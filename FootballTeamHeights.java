
import java.util.*;
public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }

        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        System.out.println("Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest Height: " + shortest);
        System.out.println("Tallest Height: " + tallest);
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
