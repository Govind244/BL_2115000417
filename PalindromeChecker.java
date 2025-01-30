import java.util.Scanner;

public class PalindromeChecker {

    public static boolean checkPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);

            if (!isAlphanumeric(leftChar)) {
                left++;
                continue;
            }
            if (!isAlphanumeric(rightChar)) {
                right--;
                continue;
            }

            if (toLowerCase(leftChar) != toLowerCase(rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean isAlphanumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (checkPalindrome(inputString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
    }
}