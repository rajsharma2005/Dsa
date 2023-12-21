import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PangramSentence {
    //https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        }
        Set<Character> uniqueLetters = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z' ){
                uniqueLetters.add(ch);
            }
        }
        if (uniqueLetters.size() == 26){
            return true;
        }else
            return false;
    }
    public static boolean hasUniqueLetters(String str) {
        Set<Character> uniqueLetters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // If the character is already in the set, it's a repeated letter
            if (!uniqueLetters.add(currentChar)) {
                return false;
            }
        }
        return true; // All letters are unique
    }

    public static void main(String[] args) {
        String name = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(name.length());
        System.out.println(checkIfPangram(name));
    }
}
