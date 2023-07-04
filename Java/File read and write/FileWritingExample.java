import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("newfile.txt"); 
             BufferedWriter bw = new BufferedWriter(fileWriter)) {

            bw.write("Hello, World!");
            bw.newLine();
            bw.write("This is an example of writing to a file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
