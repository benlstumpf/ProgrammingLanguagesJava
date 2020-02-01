
import java.util.HashMap;
import java.lang.Integer;

public class SelectMethodTesting {
  public static void main (String[] args){
    HashMap hashmap = new HashMap();
    hashmap.put("one", 1);
    System.out.println();
    System.out.println(hashmap.get("one").getClass().getName());
    System.out.println();
  }
}
