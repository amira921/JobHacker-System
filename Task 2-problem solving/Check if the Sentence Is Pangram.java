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

// using frequency array
class Solution {
    public boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        if(len<25) return false;
        
        int[] freqArray = new int[26];
        for (int i = 0; i < len; i++) 
            freqArray[sentence.charAt(i) - 'a']++;
        
        for(int i=0;i<26;i++)
            if(freqArray[i]==0) return false;
            
        return true;
    }
}