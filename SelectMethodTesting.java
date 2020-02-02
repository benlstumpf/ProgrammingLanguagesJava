
import java.util.HashMap;
import java.lang.Integer;
import java.util.Arrays;



public class SelectMethodTesting {
  public static void main (String[] args){
    EntryObject[] array = new EntryObject[5];

    array[3] = new EntryObject("one",1);
    array[2] = new EntryObject("two",2);
    array[4] = new EntryObject("three",3);
    array[0] = new EntryObject("four",4);
    array[1] = new EntryObject("five",5);

    Arrays.sort(array);

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);
  }
}
