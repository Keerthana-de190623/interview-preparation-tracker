import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatenatedWords {

    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "catdog", "banana", "dogcat", "rat");
        System.out.println(findConcatenatedWords(words));
    }

    public static List<String> findConcatenatedWords(List<String> words) {
        Set<String> wordSet = new HashSet<>(words);  
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (canForm(word, wordSet, 0)) {
                result.add(word);
            }
        }

        return result;
    }

    private static boolean canForm(String word, Set<String> wordSet, int start) {

        if (start == word.length()) {
            return true;
        }


        for (int i = start + 1; i <= word.length(); i++) {
            String prefix = word.substring(start, i);
            if (wordSet.contains(prefix) && !prefix.equals(word)) {  

                if (canForm(word, wordSet, i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
