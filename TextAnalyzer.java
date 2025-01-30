import java.util.*;
public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        countVowelsAndConsonants(input);
        System.out.println("Reversed string: " + reverseString(input));
    }

    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0, consonantCount = 0;
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }


    public static String reverseString(String str) {
        char[] characters = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        
        return new String(characters);
    }
}