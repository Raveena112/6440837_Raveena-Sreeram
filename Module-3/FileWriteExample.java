import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriteExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             FileWriter writer = new FileWriter("output.txt")) {
            System.out.print("Enter a string to write to file: ");
            String data = sc.nextLine();
            writer.write(data);
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
