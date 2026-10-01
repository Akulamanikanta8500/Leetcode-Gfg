import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String sortVowels(String s) {
       
        ArrayList<Character> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                vowels.add(c);
            }
        }
        
       
        Collections.sort(vowels);
        
       
        StringBuilder result = new StringBuilder(s);
        int vowelIndex = 0;
        for (int i = 0; i < result.length(); i++) {
            if (isVowel(result.charAt(i))) {
                result.setCharAt(i, vowels.get(vowelIndex++));
            }
        }
        
        return result.toString();
    }
    
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}