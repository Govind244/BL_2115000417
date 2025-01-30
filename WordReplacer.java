import java.util.Scanner;

public class WordReplacer {

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        if (sentence == null || wordToReplace == null || replacementWord == null) return sentence;

        String result = "";
        int startIndex = 0;
        while (startIndex < sentence.length()) {
            int wordStart = sentence.indexOf(wordToReplace, startIndex);
            if (wordStart == -1) {
                result += sentence.substring(startIndex);
                break;
            }

            result += sentence.substring(startIndex, wordStart) + replacementWord;
            startIndex = wordStart + wordToReplace.length();
        }

        return result;
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