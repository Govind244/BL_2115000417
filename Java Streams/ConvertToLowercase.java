import java.io.*;

public class ConvertToLowercase {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                writer.write(Character.toLowerCase(charRead));
            }
            System.out.println("File content converted to lowercase successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
