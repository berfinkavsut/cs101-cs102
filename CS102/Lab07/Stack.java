package cs102.ds;

public class Stack {
  
  //property
  private List list;
  
  //constructor
  public Stack(){
    list = new List();
  }
  
  /**
   * push method
   * @param String elemnet
   * @return the added String element
   */
  public String push (String text){
    list.addToHead(text);
    return text;
  }
  
  /**
   * pop method
   * @return 
   */
  public String pop(){
    //String delete = list.getData(0);
    return list.removeFromHead();
    //return delete;
  }
  
  /**
   * Returns the list is empty
   * @return if empty false, if not true
   */
  public boolean isEmpty(){
    return list.isEmpty();
  }
}