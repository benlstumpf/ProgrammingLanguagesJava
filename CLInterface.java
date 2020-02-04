
import java.util.HashMap;
import java.util.Scanner;

 public class CLInterface {
	   /**
	    * [main description]
	    * @param args [description]
	    */
	public static void main (String[] args){
		//get file in scanner so file can be read
		String filePath = args[0];
		Scanner scanner = FileHandler.getScanner(filePath);

		//Make HashMap to store words
		HashMap hashmap = new HashMap();
		hashmap = WordCounting.countWords(scanner, hashmap);

		//Convert hashmap from map to array
		EntryObject[] completeList = Reporting.mapToList(hashmap);

		Reporting.sortArray(completeList);

		EntryObject[] topFive = Reporting.getTopFive(completeList);
		EntryObject[] bottomFive = Reporting.getBottomFive(completeList);

		Reporting.arrayToFile(completeList, FileHandler.getBufferWriter(args[1]));

		printArray(topFive);
		printArray(bottomFive);
	}
  /**
   * [printArray description]
   * @param array [description]
   */
  public static void printArray(EntryObject[] array){
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i].toString());
    }
    //System.out.println(array.length);
	}

}
