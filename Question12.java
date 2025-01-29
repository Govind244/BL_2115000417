import java.util.*;
public class Question12 {
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        if (sentence == null || wordToReplace == null || replacementWord == null) return sentence;
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();
        System.out.println("Modified sentence: " + replaceWord(sentence, wordToReplace, replacementWord));
        
    }
}
