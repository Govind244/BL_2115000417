import java.util.Scanner;

public class MostFrequentCharacterFinder {

    public static char findMostFrequentCharacter(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }

        int[] frequencies = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequencies[c]++;
        }

        char mostFrequent = '\0';
        int maxFrequency = 0;

        for (int i = 0; i < 256; i++) {
            if (frequencies[i] > maxFrequency) {
                mostFrequent = (char) i;
                maxFrequency = frequencies[i];
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        try {
            char mostFrequent = findMostFrequentCharacter(inputString);
            System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}