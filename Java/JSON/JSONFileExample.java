

import org.json.JSONArray;
import org.json.JSONTokener;

import java.io.FileReader;

public class JSONFileExample {
    public static void main(String[] args) {
        try {
            // Read the JSON file
            FileReader fileReader = new FileReader("data.json");
            JSONTokener tokener = new JSONTokener(fileReader);
            JSONObject jsonObject = new JSONObject(tokener);

            // Extract data from the JSON object
            String name = jsonObject.getString("name");
            int age = jsonObject.getInt("age");
            String city = jsonObject.getString("city");
            JSONArray hobbies = jsonObject.getJSONArray("hobbies");

            // Print the extracted data
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("Hobbies:");
            for (int i = 0; i < hobbies.length(); i++) {
                String hobby = hobbies.getString(i);
                System.out.println("- " + hobby);
            }

            // Close the file reader
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

