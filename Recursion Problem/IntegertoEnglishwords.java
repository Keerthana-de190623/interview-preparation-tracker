public class IntegertoEnglishwords {
        private static final String[] BELOW_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                                                  "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                                                  "Eighteen", "Nineteen"};
        private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
    
        public String numberToWords(int num) {
            if (num == 0) return "Zero";
            return helper(num);
        }
    
        private String helper(int num) {
            if (num == 0) return "";
            if (num < 20) return BELOW_20[num] + " ";
            if (num < 100) return TENS[num / 10] + " " + helper(num % 10);
            if (num < 1000) return BELOW_20[num / 100] + " Hundred " + helper(num % 100);
            for (int i = 0; i < THOUSANDS.length; i++) {
                if (num < Math.pow(1000, i + 1)) {
                    return helper(num / (int) Math.pow(1000, i)) + THOUSANDS[i] + " " + helper(num % (int) Math.pow(1000, i));
                }
            }
            return "";
        }
    
        public static void main(String[] args) {
            IntegertoEnglishwords solution = new IntegertoEnglishwords();
            System.out.println(solution.numberToWords(123)); 
            // "One Hundred Twenty Three"
        }
    }
    
