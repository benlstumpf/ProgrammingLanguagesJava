/*
•	CMInterface Class
o	Main: Initializes objects and counting algorithm.
o	Accepts file as argument when running application

 */

import java.util.Hashmap;

 public class CLInterface {
	public static void main (String[] args){
		//get file in scanner so file can be read
		String filePath = args[0];
		Scanner scanner = FileHandler.getScanner(filePath);

		//Make HashMap to store words
		Hashmap hashmap = new Hashmap();
		hashmap = WordCounting.countwords(scanner, hashmap);

		//Convert hashmap from map to array
		EntryObject[] completeList = Reporting.mapToList(hashmap);
		//EntryObject[] topFive = Reporting.getTopFive(completeList);
		//EntryObject[] bottomFive = Reporting.getBottomFive(completeList);

		Reporting.printArray(completeList);
	}

}
