import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHandler{

  /**
   * Create a Scanner from a file location string
   * @param  filePath file location path
   * @return          Scanner needed to read a file
   */
  public static Scanner getScanner(String filePath){
	  Scanner scanner = null;
	  try{
      File file = new File(filePath);
     scanner = new Scanner(file);
    }
    catch (FileNotFoundException e) {
      
    }
    return scanner;
  }
  /**
   * [getBufferWriter description]
   * @param  fileName [description]
   * @return          [description]
   */
  public static BufferedWriter getBufferWriter(String fileName){
    //This was borrowed from https://stackoverflow.com/questions/36931603/writing-inside-a-text-file-using-scanner-class
	  BufferedWriter writer = null;
	  try {
		  writer = new BufferedWriter(new FileWriter(fileName));
	   } catch (IOException e) {
		     e.printStackTrace();
	   }
	    return writer;
  }
  /**
   * [printRecord description]
   * @param writer [description]
   * @param entry  [description]
   */
  public static void printRecord(BufferedWriter writer, EntryObject entry) {
    try {
		writer.write(entry.getKey() + ", " + entry.getValue());
		writer.newLine();
	 } catch (IOException e) {
		e.printStackTrace();
	 }

  }

}
