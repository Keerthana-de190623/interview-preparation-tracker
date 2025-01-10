public class BalancedParentheses {
    public boolean isValid(String s) {
        return isValid(s, 0, 0);
    }

    private boolean isValid(String s, int index, int balance) {
        if (index == s.length()) {
            return balance == 0;
        }

        char current = s.charAt(index);
        if (current == '(') {
            return isValid(s, index + 1, balance + 1);
        } else if (current == ')') {
            return balance > 0 && isValid(s, index + 1, balance - 1);
        }
        return isValid(s, index + 1, balance);
    }
    public static void main(String[] args) {
        BalancedParentheses checker = new BalancedParentheses();
        String input1 = "()";
        String input2 = "(())";
        String input3 = "(()))";
        String input4 = "((())";
        String input5 = "abc(de(fg))";

        System.out.println("Input: \"" + input1 + "\" -> Output: " + checker.isValid(input1)); // true
        System.out.println("Input: \"" + input2 + "\" -> Output: " + checker.isValid(input2)); // true
        System.out.println("Input: \"" + input3 + "\" -> Output: " + checker.isValid(input3)); // false
        System.out.println("Input: \"" + input4 + "\" -> Output: " + checker.isValid(input4)); // false
        System.out.println("Input: \"" + input5 + "\" -> Output: " + checker.isValid(input5)); // true
    }
}
