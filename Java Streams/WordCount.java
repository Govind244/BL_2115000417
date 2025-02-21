import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "textFile.txt";
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
            sortedList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < 5 && i < sortedList.size(); i++) {
                System.out.println(sortedList.get(i).getKey() + ": " + sortedList.get(i).getValue());
            }
        } catch (IOException e
