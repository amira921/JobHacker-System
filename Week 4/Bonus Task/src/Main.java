import java.util.*;
public class Main {
    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();
        StringTokenizerManipulation stm = new StringTokenizerManipulation();

        Scanner scanner = new Scanner(System.in);
        String sentence = "Hello / World, Hello /word: Hello -World ?";
        String word = "World";

        System.out.println("number of occurrences of " + word);
        System.out.println("Using StringTokenizer Class: " + stm.wordCounts(sentence,word));
        System.out.println("Using String Class(Method 1): " + sm.wordCounts1(sentence,word));
        System.out.println("Using String Class(Method 1): " + sm.wordCounts2(sentence,word));



        word = "Hello";
        System.out.println("\nnumber of occurrences of " + word);
        System.out.println("Using StringTokenizer Class: " + stm.wordCounts(sentence,word));
        System.out.println("Using String Class(Method 1): " + sm.wordCounts1(sentence,word));
        System.out.println("Using String Class(Method 1): " + sm.wordCounts2(sentence,word));

    }
}