import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultipleResourcesExample {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output.txt")) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println(buffer);
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }finally{
            System.out.println("Bloque finally");
        }
    }
}
