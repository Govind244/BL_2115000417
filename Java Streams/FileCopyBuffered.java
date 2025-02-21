import java.io.*;

public class FileCopyBuffered {
    public static void main(String[] args) {
        String sourceFile = "largeSourceFile.txt";
        String destinationFileBuffered = "destinationBuffered.txt";
        String destinationFileUnbuffered = "destinationUnbuffered.txt";

        long startTime = System.nanoTime();
        copyFileBuffered(sourceFile, destinationFileBuffered);
        long endTime = System.nanoTime();
        long bufferedTime = endTime - startTime;
        System.out.println("Buffered copy time: " + bufferedTime / 1000000 + " ms");

        startTime = System.nanoTime();
        copyFileUnbuffered(sourceFile, destinationFileUnbuffered);
        endTime = System.nanoTime();
        long unbufferedTime = endTime - startTime;
        System.out.println("Unbuffered copy time: " + unbufferedTime / 1000000 + " ms");

        System.out.println("Buffered Streams are " + (unbufferedTime / (double) bufferedTime) + " times faster.");
    }

    public static void copyFileBuffered(String sourceFile, String destinationFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void copyFileUnbuffered(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
