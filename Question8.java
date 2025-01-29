import java.util.*;
public class Question9 {
    public static char findMostFrequentCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }
        Map<Character, Integer> charFrequencies = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = '\0'; 
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry: charFrequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequent = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequent;
    }

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        try {
            char mostFrequent = findMostFrequentCharacter(inputString);
            System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}