
public class ParsingABooleanExpression {

    public boolean parseBoolExpr(String expression) {
        return parse(expression, new int[]{0});
    }

    private boolean parse(String expr, int[] index) {
        char current = expr.charAt(index[0]);

        if (current == 't') {
            index[0]++;
            return true;
        }
        if (current == 'f') {
            index[0]++;
            return false;
        }

        if (current == '!') {
            index[0] += 2;
            boolean result = !parse(expr, index);
            index[0]++;
            return result;
        }

        if (current == '&') {
            index[0] += 2;
            boolean result = true;
            while (expr.charAt(index[0]) != ')') {
                result &= parse(expr, index);
                if (expr.charAt(index[0]) == ',') {
                    index[0]++;
                }
            }
            index[0]++;
            return result;
        }

        if (current == '|') {
            index[0] += 2;
            boolean result = false;
            while (expr.charAt(index[0]) != ')') {
                result |= parse(expr, index);
                if (expr.charAt(index[0]) == ',') {
                    index[0]++;
                }
            }
            index[0]++;
            return result;
        }

        throw new IllegalArgumentException("Invalid character in expression");
    }
}
/*
 * class Solution {
    public boolean parseBoolExpr(String expression) {
        return parse(expression, 0).result;
    }

    private Result parse(String expr, int index) {
        char current = expr.charAt(index);

        if (current == 't') return new Result(true, index + 1);
        if (current == 'f') return new Result(false, index + 1);

        if (current == '!') {
            Result subResult = parse(expr, index + 2); 
            return new Result(!subResult.result, subResult.index + 1);
        }

        if (current == '&') {
            boolean result = true;
            int i = index + 2; 
            while (expr.charAt(i) != ')') {
                Result subResult = parse(expr, i);
                result &= subResult.result;
                i = subResult.index;
                if (expr.charAt(i) == ',') i++; 
            }
            return new Result(result, i + 1); 
        }

        if (current == '|') {
            boolean result = false;
            int i = index + 2; 
            while (expr.charAt(i) != ')') {
                Result subResult = parse(expr, i);
                result |= subResult.result;
                i = subResult.index;
                if (expr.charAt(i) == ',') i++;
            }
            return new Result(result, i + 1); // Skip ')'
        }

        throw new IllegalArgumentException("Invalid character in expression");
    }

    private static class Result {
        boolean result;
        int index;

        Result(boolean result, int index) {
            this.result = result;
            this.index = index;
        }
    }
}

 * 
 */