public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String s = "23";
        letterCombinationsPrint(s);
    }

    public static void letterCombinationsPrint(String s) {
        helperPrint("", s);
    }

    public static void helperPrint(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        int start = 0;
        int end = 0;
        int c = unprocessed.charAt(0) - '0';
        switch (c) {
            case 7:
                start = 15;
                end = 19;
                break;
            case 8:
                start = 19;
                end = 22;
                break;
            case 9:
                start = 22;
                end = 26;
                break;
            default:
                start = (3 * c) - 6;
                end = start + 3;
                break;
        }
        for (int i = start; i < end; i++) {
            char letter = (char) ('a' + i);
            helperPrint(processed + letter, unprocessed.substring(1));
        }
    }
}
