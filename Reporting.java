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
      FileHandler.printRecord(writer, array[i]);
    }
  }
  public static void printArray(EntryObject[] array){
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i].toString());
    }
    System.out.println(array.length);
	}
  public static void sortArray (EntryObject[] array){
      //bubble sort code is short so I choose it for this reason
      int arrayLength = array.length;
        EntryObject temp = null;
         for(int i=0; i < arrayLength; i++){
                 for(int j=1; j < (arrayLength-i); j++){
                          if(array[j-1].getValue() < array[j].getValue()){
                                 //swap elements
                                 temp = array[j-1];
                                 array[j-1] = array[j];
                                 array[j] = temp;
                         }

                 }
         }
  }
public static EntryObject[] getBottomFive(EntryObject[] completeList) {
  EntryObject[] bottomFive = new EntryObject[5];
  for(int i = 0; i < 5; i++){
      bottomFive[i] = completeList[(completeList.length-1)-i];
  }
  return bottomFive;
}
public static EntryObject[] getTopFive(EntryObject[] completeList) {
  EntryObject[] topFive = new EntryObject[5];
  for(int i = 0; i < 5; i++){
      topFive[i] = completeList[i];
  }
  return topFive;
}

}
