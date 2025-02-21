import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
        String sourceFile = "inpt.txt";
        String destinationFile = "output.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
            System.out.println("File content copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
