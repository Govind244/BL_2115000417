import java.util.*;
public class Question3 {

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false; 
        }
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
    }
}