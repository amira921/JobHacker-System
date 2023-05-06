import java.io.*;
import java.net.URL;

public class FileManipulation {
     File readFromWebToFile(String urlString) throws IOException {
        URL url = new URL(urlString);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        FileWriter writer = new FileWriter("Scores.txt");

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line + "\n");
        }
        reader.close();
        writer.close();
        return new File("Scores.txt");
    }

     int getSum(File file) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        int sum = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] scores = line.split(" ");
            for (String score : scores) {
                sum += Integer.parseInt(score);
            }
        }
        bufferedReader.close();
        return sum;
    }

     int getAverage(File file) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        int sum = 0 , count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] scores = line.split(" ");
            for (String score : scores) {
                sum += Integer.parseInt(score);
                count++;
            }
        }
        bufferedReader.close();
        return sum/count;
    }
}
