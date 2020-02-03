
import java.util.HashMap;
import java.util.Scanner;

 public class CLInterface {
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

		Reporting.printArray(topFive);
		Reporting.printArray(bottomFive);
	}

}
