public class FileHandler{

  /**
   * Create a bufferreader and prequeisit objects from a file location string
   * @param  filePath file location path
   * @return          BufferReader needed to read a file
   */
  public static BufferedReader getBufferReader(String filePath){


    return new BufferedReader(fileReader);
  }

  /**
   * Closes an open buffer reader
   * @param reader The bufferreader to be closed
   */
  public static void closeReader(BufferedReader reader){
    reader.close();
  }

}
