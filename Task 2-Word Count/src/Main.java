import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file =new FileInputStream("Lincoln.txt");
            byte[] bytes = new byte[(int) file.available()];
            file.read(bytes);
            String content = new String(bytes);
            String[] words = content.split("\\s+");
            int wordCount = words.length;
            System.out.println("The Lincoln file contains " + wordCount + " words.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
