public class BasicCalculator {
    private static int index = 0; 

    public static int calculate(String s) {
        index = 0; 
        return evaluate(s);
    }

    private static int evaluate(String s) {
        int result = 0;
        int number = 0;
        int sign = 1; 

        while (index < s.length()) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                
                number = number * 10 + (c - '0');
            } else if (c == '+') {
 
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {

                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {

                index++; 
                result += sign * evaluate(s);
                number = 0; 
            } else if (c == ')') {
                result += sign * number;
                return result;
            }

            index++;
        }

        result += sign * number;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate("1 + 1")); // Output: 2
        System.out.println(calculate(" 2-1 + 2 ")); // Output: 3
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)")); // Output: 23
    }
}

