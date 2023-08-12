import java.util.*;

public class WordDictionary {

    public static void main(String[]args){
        wordDictionary dict = new wordDictionary();
        dict.addWord("apple");
        dict.addWord("astronaut");
        dict.addWord("ball");
        dict.addWord("camera");
        dict.addWord("dress");
        dict.printValues('a');
        dict.printDictionary();
    }

    static class wordDictionary {
        Map<Character,ArrayList<String>> wordDictionary;
        public wordDictionary(){
            wordDictionary = new HashMap<>();
            for(char c='a';c<'z';c++){
                wordDictionary.put(c,new ArrayList<>());
            }
        }
        public void addWord(String word){
            for(Map.Entry m : wordDictionary.entrySet())
                if(m.getKey().equals(word.charAt(0))) wordDictionary.get(m.getKey()).add(word);
        }
        public void printDictionary(){
            for(Map.Entry m : wordDictionary.entrySet()){
                System.out.println(m.getKey() + ": " + m.getValue());
            }
        }
        public void printValues(char key){
            System.out.println(wordDictionary.get(key));
        }
    }
}


