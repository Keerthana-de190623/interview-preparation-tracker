
import java.util.ArrayList;
import java.util.List;

public class Generateparenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, 0, 0, n, "");
        return result;
    }

    public void generate(List<String> result, int open, int close, int max, String current) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (open < max) {
            generate(result, open + 1, close, max, current + "(");
        }
        if (close < open) {
            generate(result, open, close + 1, max, current + ")");
        }
        
        // }
        //     public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);

        //     System.out.print("Enter the number of pairs of parentheses: ");
        //     int n = sc.nextInt();
        //     Generateparenthesis solution = new Generateparenthesis();
        //     List<String> result = solution.generateParenthesis(n);
        //     System.out.println("Generated Parentheses Combinations:");
        //     System.out.println(result);
        // }
    }
}
