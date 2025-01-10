public class CountGoodNumbers {
        public int countGoodNumber(int n) {
            return countGoodNumbersHelper(n, 0);
        }
    
        private int countGoodNumbersHelper(int n, int current) {
            if (current > n) return 0;
            if (current == n) return 1;
            
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                if (!containsDigit(current, i)) {
                    count += countGoodNumbersHelper(n, current * 10 + i);
                }
            }
            return count;
        }
    
        private boolean containsDigit(int current, int digit) {
            while (current > 0) {
                if (current % 10 == digit) return true;
                current /= 10;
            }
            return false;
        }
    
        public static void main(String[] args) {
            CountGoodNumbers goodNumber = new CountGoodNumbers();
            System.out.println(goodNumber.countGoodNumber(5)); // Output count of good numbers <= 50
        }
    }
    

