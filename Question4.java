import java.util.*;

public class Question4 {
    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> uniqueChars = new LinkedHashSet<>(); 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (uniqueChars.add(c)) { 
                sb.append(c);
            }
        }
        return sb.toString();
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