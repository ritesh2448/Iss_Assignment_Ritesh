
import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        try {
            File file = new File("newfile.txt"); 
            
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
