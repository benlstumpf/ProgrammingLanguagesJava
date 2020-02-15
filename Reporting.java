import java.io.BufferedWriter;
import java.util.HashMap;

public class Reporting {
  /**
   * [mapToList description]
   * @param  map [description]
   * @return     [description]
   */
  public static EntryObject[] mapToList (HashMap map){
    EntryObject[] returningArray = new EntryObject[map.size()];
    Object[] keyArray = map.keySet().toArray(); // returns an array of keys
    Object[] valuesArray = map.values().toArray(); // returns an array of values
    arraysToObjects (returningArray, keyArray, valuesArray);
    return returningArray;
  }
  /**
   * [arraysToObjects description]
   * @param returningList [description]
   * @param keyArray      [description]
   * @param valuesArray   [description]
   */
  private static void arraysToObjects (EntryObject[] returningList, Object[] keyArray, Object[] valuesArray){
    for(int i = 0; i < keyArray.length; i++){
    	returningList[i] =  new EntryObject((String)keyArray[i], (Integer)valuesArray[i]);
    }
  }
  /**
   * [arrayToFile description]
   * @param array  [description]
   * @param writer [description]
   */
  public static void arrayToFile (EntryObject[] array, BufferedWriter fileWriter){
    try{
      for (int i = 0; i < array.length; i++){
        FileHandler.printRecord(fileWriter, array[i]);
      }
    }
    catch(FileNotFoundException e){

    }

  }
    /**
   * [sortArray description]
   * @param array [description]
   */
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
  /**
   * [getBottomFive description]
   * @param  completeList [description]
   * @return              [description]
   */
  public static EntryObject[] getBottomFive(EntryObject[] completeList) {
    EntryObject[] bottomFive = new EntryObject[5];
    for(int i = 0; i < 5; i++){
      bottomFive[i] = completeList[(completeList.length-1)-i];
    }
    return bottomFive;
  }
  /**
   * [getTopFive description]
   * @param  completeList [description]
   * @return              [description]
   */
  public static EntryObject[] getTopFive(EntryObject[] completeList) {
    EntryObject[] topFive = new EntryObject[5];
    for(int i = 0; i < 5; i++){
      topFive[i] = completeList[i];
    }
    return topFive;
  }

}
