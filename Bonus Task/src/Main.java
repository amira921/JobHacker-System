import java.util.*;
public class Main {
    static int stringTokenizer(String sentence, String word){
        StringTokenizer st = new StringTokenizer(sentence);
        int count = 0;
        while (st.hasMoreElements()) {
            if (word.equals(st.nextToken())) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "Hello / World, Hello /word: Hello -World ?";
        String word = "World";
        System.out.println("number of occurrences: " + stringTokenizer(sentence,word));
        word = "Hello";
        System.out.println("number of occurrences: " + stringTokenizer(sentence,word));
    }
}