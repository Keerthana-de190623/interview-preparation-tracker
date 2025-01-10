import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpecialBinaryString {
    public static void main(String[] args) {
        String s = "11011000";
        System.out.println(makeLargestSpecial(s));
    }

    public static String makeLargestSpecial(String s) {
        if (s.length() <= 1) {
            return s;
        }

        List<String> parts = new ArrayList<>();
        int balance = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            balance += (s.charAt(i) == '1') ? 1 : -1;

            if (balance == 0) {

                String sub = s.substring(start + 1, i);
                parts.add("1" + makeLargestSpecial(sub) + "0");
                start = i + 1;
            }
        }

        Collections.sort(parts, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part);
        }

        return result.toString();
    }
}
