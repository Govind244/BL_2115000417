import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        int[] charCounts = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            char c = Character.toLowerCase(str1.charAt(i));
            charCounts[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = Character.toLowerCase(str2.charAt(i));
            charCounts[c]--;
            if (charCounts[c] < 0) {
                return false;
            }
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
        scanner.close();
    }
}