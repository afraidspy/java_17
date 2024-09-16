import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        File srcFile = new File("source.txt");
        File destFile = new File("destination.txt");

        // Try-with-resources to automatically close the streams
        try (BufferedReader reader = new BufferedReader(new FileReader(srcFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {
             
            String line;
            // Read and write line by line for better efficiency
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Ensure that line endings are copied
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
