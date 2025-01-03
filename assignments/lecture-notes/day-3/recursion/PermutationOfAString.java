package recursion;

public class PermutationOfAString {
    public static void main(String[] args) {
        String s = "abc";
        permutationPrint(s);
    }

    public static void permutationPrint(String s) {
        helperPrint("", s);
    }

    public static void helperPrint(String processed, String unporcessed) {
        if (unporcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < processed.length() + 1; i++) {
            char ch = unporcessed.charAt(0);
            String newProcessed = processed.substring(0, i) + ch + processed.substring(i);
            String newUnprocessed = unporcessed.substring(1);
            helperPrint(newProcessed, newUnprocessed);
        }
    }
}
