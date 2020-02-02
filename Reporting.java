import java.io.BufferedWriter;

public class Reporting {
  public static EntryObject[] mapToList (HashMap map){
    EntryObject[] returningArray = EntryObject[map.size()];
    String[] keyArray = map.keySet().toArray(); // returns an array of keys
    Integer[] valuesArray = map.values().toArray(); // returns an array of values
    return returningArray;
  }
  public static void arraysToObjects (EntryObject[] returningList, String[] keyArray, Integer[] valuesArray){
    for(int i = 0; i < keyArray.length; i++){
    	returningList[i] =  new EntryObject(keyArray[i], valuesArray[i]);
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
