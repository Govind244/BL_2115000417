import java.util.Scanner;

public class CharacterRemover {

    public static String removeCharacter(String str, char charToRemove) {
        if (str == null || str.length() == 0) {
            return str;
        }
        
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != charToRemove) {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String modifiedString = removeCharacter(inputString, charToRemove);
        System.out.println("Modified String: " + modifiedString);
    }
}