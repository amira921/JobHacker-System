import java.util.*;

public class Word_Dictionary {

    public static void main(String[]args){
        WordDictionary dict = new WordDictionary();
        dict.addWord('a',"apple");
        dict.addWord('a',"astronaut");
        dict.addWord('b',"ball");
        dict.addWord('c',"camera");
        dict.addWord('d',"dress");
        dict.printValues('a');
        dict.printDictionay();
    }

    static class WordDictionary {
        Map<Character,ArrayList<String>> word_dectionary;
        public WordDictionary(){
            word_dectionary = new HashMap<>();
            for(char c='a';c<'z';c++){
                word_dectionary.put(c,new ArrayList<>());
            }
        }
        public void addWord(char key,String word){
            word_dectionary.get(key).add(word);
        }
        public void printDictionay(){
            for(Map.Entry m : word_dectionary.entrySet()){
                System.out.println(m.getKey() + ": " + m.getValue());
            }
        }
        public void printValues(char key){
            System.out.println(word_dectionary.get(key));
        }
    }
}


