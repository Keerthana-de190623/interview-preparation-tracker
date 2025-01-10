public class KthSymbolInGrammar {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int mid = (1 << (n - 1)) / 2;
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } 
        else {
            return 1 - kthGrammar(n - 1, k - mid);
        }
    }
    public static void main(String[] args) {
        KthSymbolInGrammar solver = new KthSymbolInGrammar();
        int n = 4;
        int k = 5;
        System.out.println("The " + k + "-th symbol in row " + n + " is: " + solver.kthGrammar(n, k));
    }
}
