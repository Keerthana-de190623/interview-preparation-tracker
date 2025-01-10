
import java.util.*;

public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        generateCombinations(digits, 0, "", mapping, result);
        return result;
    }
    private void generateCombinations(String digits, int index, String current,
            Map<Character, String> mapping, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = mapping.get(digit);
        for (char letter : letters.toCharArray()) {
            generateCombinations(digits, index + 1, current + letter, mapping, result);
        }
    }
}
