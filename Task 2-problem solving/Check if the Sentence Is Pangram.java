import java.util.Hashtable;

class Solution {
    public boolean checkIfPangram(String sentence) {
        Hashtable<Character,Integer> alphabet = new Hashtable<>();
        
        for(int i=0 ;i< sentence.length();i++){
            int count = 1;
            if (alphabet.containsKey(sentence.charAt(i))) count += alphabet.get(sentence.charAt(i));
            alphabet.put(sentence.charAt(i), count);
        }
       
        return (alphabet.size() == 26);   
    }
}