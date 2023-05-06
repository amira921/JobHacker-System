import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Lincoln.txt");
        int wordCount = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            scanner.close();
            System.out.println("The file " + file.getName() + " contains " + wordCount + " words.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found, Check the name of the file or the file may be deleted or moved");
        }
    }
}
