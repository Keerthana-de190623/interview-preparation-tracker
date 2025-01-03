package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        String s = "abc";
        // subSetPrint(s);
        System.out.println(subSetReturn(s));
        System.out.println(subSetCount(s));
    }

    public static void subSetPrint(String s) {
        helperPrint("", s);
    }

    public static void helperPrint(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        // Take it
        char ch = unprocessed.charAt(0);
        helperPrint(processed + ch, unprocessed.substring(1));
        // Leave it
        helperPrint(processed, unprocessed.substring(1));
    }

    public static List<String> subSetReturn(String s) {
        List<String> result = helperReturn("", s);
        return result;
    }

    public static List<String> helperReturn(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            List<String> result = new ArrayList<>();
            result.add(processed);
            return result;
        }
        List<String> result = new ArrayList<>();
        // Take it
        char ch = unprocessed.charAt(0);
        result.addAll(helperReturn(processed + ch, unprocessed.substring(1)));
        // Leave it
        result.addAll(helperReturn(processed, unprocessed.substring(1)));
        return result;
    }

    public static int subSetCount(String s) {
        return helperCount("", s);
    }

    public static int helperCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        return helperCount(processed + unprocessed.charAt(0), unprocessed.substring(1))
                + helperCount(processed, unprocessed.substring(1));
    }

}
