public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s)); // Output: "accaccacc"
    }

    public static String decodeString(String s) {
        return decodeHelper(s, 0)[0];
    }

    private static String[] decodeHelper(String s, int start) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        for (int i = start; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); 
            } else if (ch == '[') {

                String[] decodedResult = decodeHelper(s, i + 1);
                String decodedString = decodedResult[0];
                i = Integer.parseInt(decodedResult[1]); 


                for (int j = 0; j < num; j++) {
                    result.append(decodedString);
                }
                num = 0; 
            } else if (ch == ']') {

                return new String[]{result.toString(), String.valueOf(i)};
            } else {
                result.append(ch); 
            }
        }

        return new String[]{result.toString(), String.valueOf(s.length())};
    }
}
