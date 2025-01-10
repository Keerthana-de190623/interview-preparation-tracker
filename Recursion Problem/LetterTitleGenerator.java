import java.util.ArrayList;
import java.util.List;

public class LetterTitleGenerator {

    public static void main(String[] args) {

        String[] prefixes = {"A Letter to ", "A Letter of ", "The Message of ", "A Note from "};
        String[] suffixes = {"Hope", "Love", "Gratitude", "Courage", "The Unknown", "My Younger Self"};
        
        List<String> titles = generateTitles(prefixes, suffixes, 0, 0);
        
        for (String title : titles) {
            System.out.println(title);
        }
    }

    public static List<String> generateTitles(String[] prefixes, String[] suffixes, int prefixIndex, int suffixIndex) {
        List<String> titles = new ArrayList<>();
        
        if (prefixIndex == prefixes.length && suffixIndex == suffixes.length) {
            return titles;
        }

        if (prefixIndex < prefixes.length && suffixIndex < suffixes.length) {
            titles.add(prefixes[prefixIndex] + suffixes[suffixIndex]);
        }

        if (prefixIndex < prefixes.length) {
            titles.addAll(generateTitles(prefixes, suffixes, prefixIndex + 1, suffixIndex));
        }
        
        if (suffixIndex < suffixes.length) {
            titles.addAll(generateTitles(prefixes, suffixes, prefixIndex, suffixIndex + 1));
        }

        return titles;
    }
}
