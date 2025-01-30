import java.util.*;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        countAndDisplayVowelConsonant(userInput);
    }

    public static void countAndDisplayVowelConsonant(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (isAlphabet(character)) { 
                char lowerChar = toLowerCase(character);  
                if (isVowel(lowerChar)) {  
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowel count: " + vowels);
        System.out.println("Consonant count: " + consonants);
    }

    public static boolean isAlphabet(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}