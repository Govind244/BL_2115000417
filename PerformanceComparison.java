import java.io.*;
import java.util.StringTokenizer;

public class PerformanceComparison {
    public static void main(String[] args) throws IOException {
        int iterations = 1_000_000;
        String text = "hello";

      
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        long stringBuilderTime = (endTime - startTime) / 1_000_000;
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " ms");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        long stringBufferTime = (endTime - startTime) / 1_000_000;
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " ms");

     
        String filePath = "largefile.txt"; 
        long wordCount = countWordsInFile(filePath);
        System.out.println("Total words in file: " + wordCount);
    }

    public static long countWordsInFile(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        long wordCount = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            wordCount += tokenizer.countTokens();
        }

        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
        return wordCount;
    }
}
