import java.io.BufferedWriter;
import java.util.HashMap;

public class Reporting {
  public static EntryObject[] mapToList (HashMap map){
    EntryObject[] returningArray = new EntryObject[map.size()];
    Object[] keyArray = map.keySet().toArray(); // returns an array of keys
    Object[] valuesArray = map.values().toArray(); // returns an array of values
    arraysToObjects (returningArray, keyArray, valuesArray);
    return returningArray;
  }
  private static void arraysToObjects (EntryObject[] returningList, Object[] keyArray, Object[] valuesArray){
    for(int i = 0; i < keyArray.length; i++){
    	returningList[i] =  new EntryObject((String)keyArray[i], (Integer)valuesArray[i]);
    }
  }
  public static void arrayToFile (EntryObject[] array, BufferedWriter writer){
    for (int i = 0; i < array.length; i++){
      FileHandler.printRecord();
    }
  }
  public static void printArray(EntryObject[] array){
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i].toString());

    }
	}
}
