class reverseString {
    public void reverseStringPrint(char[] s) {
        reverseHelper(s, 0, s.length - 1);
        System.out.println(new String(s));
    }
    public void reverseHelper(char[] s, int left, int right) {
        if (left >= right) { 
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverseHelper(s, left + 1, right - 1);
    }
}


// public static void main(String[] args) {
    //     String str ="hello";
    //     String rstr = reverseStringPrint(str);
    //     System.err.println(" " + str);
    //     System.err.println(" "+rstr);
    // }
    // public static String reverseStringPrint(String str) {
    //     if (str.isEmpty()) {
    //         return str;
    //     }
    //     return reverseStringPrint(str.substring(1))+str.charAt(0);
    // }
