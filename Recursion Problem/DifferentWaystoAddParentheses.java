
    import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParentheses {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        System.out.println("Expression: " + expression);

        // Base case: no operator, parse as integer
        if (!expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
            result.add(Integer.parseInt(expression));
            System.out.println("Base case result for " + expression + ": " + result);
            return result;
        }

        // Traverse and split at each operator
        for (int i = 0; i < expression.length(); i++) {
            char operator = expression.charAt(i);

            if (operator == '+' || operator == '-' || operator == '*') {
                // Left and right recursive calls
                List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1));

                // Combine results
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        int value = 0;
                        if (operator == '+') {
                            value = left + right;
                        } else if (operator == '-') {
                            value = left - right;
                        } else if (operator == '*') {
                            value = left * right;
                        }
                        result.add(value);
                        System.out.println("Combining " + left + " " + operator + " " + right + " = " + value);
                    }
                }
            }
        }

        System.out.println("Result for " + expression + ": " + result);
        return result;
    }

    public static void main(String[] args) {
        DifferentWaystoAddParentheses solution = new DifferentWaystoAddParentheses();
        System.out.println("Final Results: " + solution.diffWaysToCompute("2*3-4*5"));
    }
}

