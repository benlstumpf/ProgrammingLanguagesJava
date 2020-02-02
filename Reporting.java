


public class Reporting {
  public static EntryObject[] mapToList (HashMap map){
    EntryObject[] returningArray = EntryObject[map.size()];
    Strings[] keyArray = map.keySet().toArray(); // returns an array of keys
    Integer[] valuesArray = map.values().toArray(); // returns an array of values
    return returningList;
  }
  private static arraysToObjects (EntryObject[] returningList, Strings[] keyArray, Integer[] valuesArray){
    for(int i = 0; i < keylist.length(); i++){
      sortedList[i] =  new EntryObject(keyArray[i], valuesArray[i]);
    }
  }
  public static void arrayToFile (EntryObject[] array, BufferWriter writer){
    for (int i = 0; i < array.length(); i++){
      FileHandler.printRecord
    }
  }
  public static void printArray(EntryObject[] array){
    for(int i = 0; i < array.length(); i++){
      System.out.println(array[i].toString());
    }
	}
}
