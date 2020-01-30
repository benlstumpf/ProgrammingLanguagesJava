public class FileHandler{

  /**
   * Create a bufferreader and prequeisit objects from a file location string
   * @param  filePath file location path
   * @return          BufferReader needed to read a file
   */
  public static BufferedReader getBufferReader(String filePath){

    try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                new BufferedReader(fileReader);

        }
        catch(FileNotFoundException ex) {
            throw FileNotFoundException ex;
        }
        catch(IOException ex) {
            throw IOException ex;
        }

    return bufferedReader;
  }

  /**
   * Closes an open buffer reader
   * @param reader The bufferreader to be closed
   */
  public static void closeReader(BufferedReader reader){
    reader.close();
  }

}
