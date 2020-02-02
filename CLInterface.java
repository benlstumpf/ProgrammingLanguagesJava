/*
•	CMInterface Class
o	Main: Initializes objects and counting algorithm.
o	Accepts file as argument when running application

 */

import java.util.Hashmap;

Class CLInterface {
	public static void main (String[] args){
		String filePath = args[0];
		Scanner scanner = FileHandler.getScanner(filePath);
		Hashmap hashmap = new Hashmap();
		hashmap = WordCounting.countwords(scanner, hashmap);

		EntryObject[] completeList = Reporting.mapToSortedList(hashmap);
		EntryObject[] topFive = EntryObject[5];
		EntryObject[] bottomFive = EntryObject[5];

	}

}
