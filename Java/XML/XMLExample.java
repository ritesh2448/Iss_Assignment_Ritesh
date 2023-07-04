package xml;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/*
 we use the javax.xml.parsers.DocumentBuilder class to parse an XML file and build a DOM representation of the XML document.

We create a DocumentBuilderFactory and a DocumentBuilder to parse the XML file. Then, we provide the XML file path to the parse() method of the DocumentBuilder, which returns a Document object representing the XML document
From the Document, we can access various elements, attributes, and text content of the XML document using the DOM API. In this example, we extract information about students from the XML file. We iterate over the <student> elements, retrieve the attributes (name and id), and access the <grade> element within each <student>.


 */

public class XMLExample {
    public static void main(String[] args) {
        try {
            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Parse the XML file
            File file = new File("data.xml"); // Replace "data.xml" with your XML file
            Document document = builder.parse(file);
            
            // Get the root element
            Element root = document.getDocumentElement();
            
            // Access elements and attributes
            NodeList nodeList = root.getElementsByTagName("student");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String name = element.getAttribute("name");
                    String id = element.getAttribute("id");
                    String grade = element.getElementsByTagName("grade").item(0).getTextContent();
                    
                    System.out.println("Student Name: " + name);
                    System.out.println("Student ID: " + id);
                    System.out.println("Grade: " + grade);
                    System.out.println("-------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
