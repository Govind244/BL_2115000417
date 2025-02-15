import java.io.*;

public class WordCountInFile {
    public static void main(String[] args) throws IOException {
        String filePath = "java.txt"; 
        String targetWord = "Java"; 
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int count = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+"); 
            for (String word : words) {
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }
        }
        reader.close();

        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
    }
}