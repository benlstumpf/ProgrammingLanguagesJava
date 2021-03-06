import java.util.HashMap;
import java.util.Scanner;

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
    /**
     * [countWords description]
     * @param  scan    [description]
     * @param  hashmap [description]
     * @return         [description]
     */
  public static HashMap countWords (Scanner scan, HashMap hashmap){
    HashMap map = new HashMap();
    Integer tempInt = 0;

    while(scan.hasNext()){
      tempInt = 0;
      String key = scan.next();
      //testing

      //TODO clean string
      key = DataCleaning.cleanWord(key);

      if(map.containsKey(key)){
        tempInt = (Integer) map.get(key);
        tempInt = tempInt + 1;
        map.put(key,tempInt);
      }
      else{
        map.put(key, 1);
        //System.out.println("WordCountingtesting" + key);
      }
    }
    return map;
  }





}
