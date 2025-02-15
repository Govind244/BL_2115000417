public class ConsoleToFileWriter {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        FileWriter fileWriter = new FileWriter("output.txt");

        System.out.println("Enter text to write to file (type 'exit' to stop):");

        String line;
        while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
            fileWriter.write(line + "\n");
        }

        bufferedReader.close();
        fileWriter.close();
        System.out.println("Data written to output.txt successfully!");
    }
}