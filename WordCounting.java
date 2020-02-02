/*
•	Counting Class
o	Reporting
	Print best 5
	Print last 5
	Make file of complete list
o	Document object creation
o	Word list object
	Hash map for tracking words
o	Get next word:
	Returns the next word in the document
	Checks for split word
	Sends words to be cleaned
	Returns word
o	Counting words
	Asks for new words
	Tallies words in word list
	When finished, triggers reporting of findings

 */

public class WordCounting{

  public static HashMap countwords (Scanner scanner){
    HashMap map = new HashMap();
    Integer tempInt = 0;

    while(Scanner.hasNext()){
      tempInt = 0;
      String key = scanner.next();

      //TODO clean string

      if(map.containsKey(key)){
        tempInt = map.get(key);
        tempInt = tempInt + 1;
        map.put(key,tempInt);
      }
      else{
        map.put(key, 1);
      }
    }
    return map;
  }





}
