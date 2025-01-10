import java.util.ArrayList;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        String s = "abc";
        subSetPrint(s);
    }
    /*
    without list
     * public static void subSetPrint(String s) {
        helperPrint("",s);
    }
    public static void helperPrint(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.err.println(processed);
            return;
        }
        char ch= unprocessed.charAt(0);
        //take it
        helperPrint(processed+ch, unprocessed.substring(1));
        //leave it
        helperPrint(processed, unprocessed.substring(1));
    }

without result and it shoukde return the list

    public static List<String> subSetPrint(String s) {
        List<String> result = helperPrint("",s);
        return result;
    }
    public static List<String> helperReturn(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            List<string> result = new ArrayList<>();
            result.add(processed);
            return result;
        }
        List<String> result = new ArrayList<>();
        char ch= unprocessed.charAt(0);
        //take it
        result.add(helperPrint(processed+ch, unprocessed.substring(1)));
        //leave it
        result.add(helperPrint(processed, unprocessed.substring(1)));

    }

     */


    public static List<String> subSetPrint(String s) {
        List<String> result = new ArrayList<>();
        helperPrint("",s,result);
        return result;
    }
 /*
  * public static int subSetCount(String s)
  {
  return helperCount(processed:"",s);
  }
  public static int6 helper(string processed , String unprocessed{
  if(unprocessed.isEmpty()){
    return 1;
    
  }})
  */
    public static void helperPrint(String processed, String unprocessed,List<String> result) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch= unprocessed.charAt(0);
        //take it
        helperPrint(processed+ch, unprocessed.substring(1),result);
        //leave it
        helperPrint(processed, unprocessed.substring(1),result);
    }


}
