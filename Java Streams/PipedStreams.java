import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    public void run() {
        try {
            String message = "Hello from WriterThread!";
            pipedOutputStream.write(message.getBytes());
            pipedOutputStream.close();
        } catch (IOException e) {
            System.out.println("WriterThread Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = pipedInputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
            pipedInputStream.close();
        } catch (IOException e) {
            System.out.println("ReaderThread Error: " + e.getMessage());
        }
    }
}

public class PipedStreams {
    public static void main(String[] args) {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

            WriterThread writerThread = new WriterThread(pipedOutputStream);
            ReaderThread readerThread = new ReaderThread(pipedInputStream);

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
