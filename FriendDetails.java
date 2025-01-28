import java.util.*;
public class FriendDetails {

    public static String findYoungest(String[] friends, int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = friends[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
        }
        return youngestFriend;
    }

    public static String findTallest(String[] friends, double[] heights) {
        double tallestHeight = heights[0];
        String tallestFriend = friends[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter the height of " + friends[i] + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        String youngestFriend = findYoungest(friends, ages);
        System.out.println("The youngest friend is: " + youngestFriend);

        String tallestFriend = findTallest(friends, heights);
        System.out.println("The tallest friend is: " + tallestFriend);

    }
}
