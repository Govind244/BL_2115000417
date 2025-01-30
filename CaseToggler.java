import java.util.Scanner;

public class CaseToggler {

    public static String toggleCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32);
            } else if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String toggledString = toggleCase(inputString);
        System.out.println("Toggled string: " + toggledString);
        scanner.close();
    }
}