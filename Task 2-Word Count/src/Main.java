import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file =  new File("Lincoln.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            scanner.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            String str = "the file contains " + count + '\n';
            writer.write(str);
            writer.newLine();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
