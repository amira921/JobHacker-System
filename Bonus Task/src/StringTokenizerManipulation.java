import java.util.StringTokenizer;

public class StringTokenizerManipulation {
    public int wordCounts(String sentence, String word){
        sentence = new StringManipulation().removeSpecialLetters(sentence);
        StringTokenizer st = new StringTokenizer(sentence);
        int count = 0;
        while (st.hasMoreElements()) {
            if (word.equals(st.nextToken())) count++;
        }
        return count;
    }
}
