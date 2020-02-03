import java.util.Comparator;

public class EntryObject{
  private String key;
  private Integer value = 0;

  /**
   * [EntryObject description]
   * @param s [description]
   * @param i [description]
   */
  public EntryObject (String s, Integer i){
      value = i;
      key = s;
  }
  public Integer getValue (){
    return value;
  }
  public void setValue (Integer i){
    value = i;
  }
  public String getKey (){
    return key;
  }
  public void setKey (String s){
    key = s;
  }
  /**
   * [toString description]
   * @return [description]
   */
  public String toString (){
    return key + ", " + value;
  }
}
