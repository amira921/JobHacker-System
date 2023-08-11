import java.util.HashMap;
import java.util.StringTokenizer;
public class StringManipulation {

    String removeSpecialLetters(String sentence){
        StringBuilder sb = new StringBuilder(sentence);
        for(int i=0 ; i<sb.length();i++){
            if(!Character.isLetter(sb.charAt(i)))
                sb.replace(i,i+1," ");
        }
        return sb.toString();
    }


    public int wordCounts1 (String sentence, String word){
        sentence = removeSpecialLetters(sentence);
        String[] words = sentence.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) count++;
        }
        return count;
    }

    public int wordCounts2 (String sentence, String word){
        sentence = removeSpecialLetters(sentence);
        int count = 0;
        int begin = 0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i) == ' '){
                if(sentence.substring(begin,i).equals(word)) count++;
                begin = i+1;
            }
        }
        return count;
    }
}
