import java.util.*;
public class Question5 {
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return ""; 
        }

        String[] words = sentence.split("\\s+"); 

        String longestWord = "";
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); 
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String longest = findLongestWord(inputSentence);
        System.out.println("The longest word is: " + longest);
    }
}