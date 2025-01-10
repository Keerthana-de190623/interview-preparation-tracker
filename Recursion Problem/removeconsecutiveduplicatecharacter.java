public class removeconsecutiveduplicatecharacter {
    public  String removeduplicate(String s) {
        if(s.length()<=1)
            return s;
        char first =s.charAt(0);
        String rest = removeduplicate(s.substring(1));
        return (first == rest.charAt(0))?rest:first+rest;
        
    }
    public static void main (String[] args){
        removeconsecutiveduplicatecharacter solution = new removeconsecutiveduplicatecharacter();
        System.err.println(solution.removeduplicate("aaabbccddd"));
    }
}
