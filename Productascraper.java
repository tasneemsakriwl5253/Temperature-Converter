Algorithm --
  Algorithm: Product Information Extractor
Start the program
Define the target website URL
Example: a sample product listing page
Establish HTTP connection
Send a request to the webpage
Receive HTML content as a response
Parse the HTML content
Use an HTML parser to read the webpage structure
Locate product blocks using class names / tags
Extract required details
Product Name
Product Price
Product Rating
Store extracted data
Save details in a list or table structure
Create a CSV file
Open or create products.csv
Write headers:
Name, Price, Rating
Write product data into CSV
Write one product per line
Close file and connections
Display success message
“Product data extracted and saved successfully”
End program

  Code -- 
  import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;

public class ProductScraper {

    public static void main(String[] args) {
        try {
            File input = new File("products.html");
            Document doc = Jsoup.parse(input, "UTF-8");

            Elements products = doc.getElementsByClass("product");

            FileWriter writer = new FileWriter("products.csv");
            writer.write("Name,Price,Rating\n");

            for (Element product : products) {
                String name = product.getElementsByClass("name").text();
                String price = product.getElementsByClass("price").text();
                String rating = product.getElementsByClass("rating").text();

                writer.write(name + "," + price + "," + rating + "\n");
            }

            writer.close();
            System.out.println("Data extracted and saved to products.csv");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
