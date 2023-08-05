import java.io.*;
import java.net.URL;
import java.util.*;

public class FileManipulation {
     File readFromWebToFile(String url) throws IOException {
         URL fileUrl = new URL(url);
         InputStream is = fileUrl.openStream();
         String filePath = "Scores.txt";
         FileOutputStream fos = new FileOutputStream(filePath);

         byte[] buffer = new byte[1024];
         int len;
         while ((len = is.read(buffer)) != -1) {
             fos.write(buffer, 0, len);
         }
         is.close();
         fos.close();
         return new File(filePath);
    }

     int getSum(File filePath) throws IOException{
         FileInputStream file =new FileInputStream(filePath);
         Scanner scanner = new Scanner(file);
         int sum = 0;
         while (scanner.hasNextInt()) {
             int score = scanner.nextInt();
             sum += score;
         }
         return sum;
    }

     int getAverage(File filePath) throws IOException{
         FileInputStream file =new FileInputStream(filePath);
         Scanner scanner = new Scanner(file);
         int sum = 0 , count = 0;
         while (scanner.hasNextInt()) {
             int score = scanner.nextInt();
             sum += score;
             count++;
         }
         return sum / count;
    }
}
