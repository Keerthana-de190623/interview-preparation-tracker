public class KthBitInNthBinaryString {
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0'; 
        }
        int mid = (1 << (n - 1)) / 2; 
        if (k == mid) {
            return '1'; 
        } else if (k < mid) {
            return findKthBit(n - 1, k); 
        } else {
            return (findKthBit(n - 1, (1 << (n - 1)) - k) == '0') ? '1' : '0';
        }
    }

    public static void main(String[] args) {
        KthBitInNthBinaryString solution = new KthBitInNthBinaryString();
        System.out.println(solution.findKthBit(3, 1)); // Output: '0'
        System.out.println(solution.findKthBit(3, 2)); // Output: '1'
        System.out.println(solution.findKthBit(4, 5)); // Output: '1'
        System.out.println(solution.findKthBit(4, 6)); // Output: '0'
    }
}
