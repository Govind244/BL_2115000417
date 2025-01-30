import java.util.Scanner;

public class SubstringCounter {

    public static int countSubstringOccurrences(String text, String substring) {
        if (text == null || substring == null || substring.length() == 0) {
            return 0;
        }

        int count = 0;
        int textLength = text.length();
        int subLength = substring.length();

        for (int i = 0; i <= textLength - subLength; i++) {
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (text.charAt(i + j) != substring.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        String substring = scanner.nextLine();

        int occurrences = countSubstringOccurrences(text, substring);

        System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " times in the text.");
        scanner.close();
    }
}