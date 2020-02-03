/*
•	Data cleaning Class
o	Data cleaning:
	Chooses the correct function to call in cleaning words. Function can call:
•	Split word cleaning
•	Punctuation Removal
•	Case normalization
o	Split word cleaning:
	For when words are broken at the end of a line, this function gets the next ‘word’, concatenates them and returns the word.
o	Punctuation Removal:
	Find and removes all punctuation
o	Case normalization:
	Normalizes word case to lower case.
o	Count word:
	Tracks words and counts them, stored in a hash map

 */

public class DataCleaning {
  public static String cleanWord (String word){
    //punctuation
    word =  word.replaceAll("\\p{Punct}", "");

    //word Case
    word = word.toLowerCase();

    return word;
  }






}
