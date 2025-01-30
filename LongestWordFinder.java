import java.util.Scanner;

public class LongestWordFinder {

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            return ""; 
        }

        String longestWord = "";
        String currentWord = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                currentWord += ch;
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord; 
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String longest = findLongestWord(inputSentence);
        System.out.println("The longest word is: " + longest);
        scanner.close();
    }
}