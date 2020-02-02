import java.util.Comparator;

public class EntryObject{
  private String key;
  private Integer value = 0;


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

  public Integer compareTo (EntryObject toCompare){

    int compareQuantity = ((EntryObject) toCompare).getValue();

		//ascending order
		return this.value - compareQuantity;
  }

  public String toString (){
    return key + ", " + value;
  }
}
