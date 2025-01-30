import java.util.Scanner;

public class DuplicateRemover {

    public static String removeDuplicates(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isPresent(result, c)) {
                result += c;
            }
        }
        return result;
    }

    public static boolean isPresent(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String result = removeDuplicates(inputString);
        System.out.println("String with duplicates removed: " + result);
        scanner.close();
    }
}