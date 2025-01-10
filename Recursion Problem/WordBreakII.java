import java.util.ArrayList;
import java.util.List;

public class WordBreakII {
    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = List.of("cat", "cats", "and", "sand", "dog");
        System.out.println(wordBreak(s, wordDict));
    }

    public static List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreakUtil(s, wordDict, 0, new ArrayList<>());
    }

    private static List<String> wordBreakUtil(String s, List<String> wordDict, int start, List<String> current) {
        List<String> result = new ArrayList<>();

        if (start == s.length()) {
            result.add(String.join(" ", current));
            return result;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            String word = s.substring(start, i);
            if (wordDict.contains(word)) {
                current.add(word);
                result.addAll(wordBreakUtil(s, wordDict, i, current));
                current.remove(current.size() - 1);
            }
        }

        return result;
    }
}
