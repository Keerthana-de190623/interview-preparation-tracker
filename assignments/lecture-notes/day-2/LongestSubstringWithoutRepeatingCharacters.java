public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 1;
        int result = 0;
        while (start < s.length() && end < s.length()) {
            String subs = s.substring(start, end);
            if (isUnique(subs)) {
                if (result < subs.length()) {
                    result = subs.length();
                }
            } else {
                start += 1;
            }
            end += 1;
        }
        return result;
    }

    public static boolean isUnique(String s) {
        if (s.length() > 128) {
            return false;
        }
        boolean[] marker = new boolean[128];
        for (char c : s.toCharArray()) {
            if (marker[c]) {
                return false;
            }
            marker[c] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
