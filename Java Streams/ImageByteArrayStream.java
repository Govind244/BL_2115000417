import java.io.*;

public class ImageByteArrayStream {
    public static void main(String[] args) {
        String sourceImage = "originalImage.jpg";
        String destinationImage = "copiedImage.jpg";

        try {
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageData = baos.toByteArray();
            FileOutputStream fos = new FileOutputStream(destinationImage);
            fos.write(imageData);
            fos.close();

            System.out.println("Image copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
