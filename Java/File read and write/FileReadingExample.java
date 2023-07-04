import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("newfile.txt"); // Replace "input.txt" with the path to your file
             BufferedReader br = new BufferedReader(fileReader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
