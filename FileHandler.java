import java.io.File;
import java.io.FileNotFoundException;
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
      e.printStackTrace();
  }
    return scanner;
  }
  public static BufferedWriter getBufferWriter(String fileName){
    //This was borrowed from https://stackoverflow.com/questions/36931603/writing-inside-a-text-file-using-scanner-class
    return new BufferedWriter(new FileWriter(fileName));
  }
  public static void printRecord(BufferedWriter writer, String key, Integer value) {
    writer.write(key + ", " + value);
    writer.newLine();
  }

}
