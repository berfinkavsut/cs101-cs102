package cs102.ds;

public class List {
  
  
  // property
  private Node head;
  
  // constructor
  public List() {
    head = null;
  }
  
  /**
   * Adds the String text to head
   * @param String text
   */
  public void addToHead(String text) {
    if (head == null) {
      head = new Node(text);
    } 
    else {
      Node newNode = new Node(text);
      newNode.next = head;
      head = newNode;
    }
  }
  
  /**
   * Adds String text to end
   * @param String text
   * @return String parameter text
   */
  public String addToTail(String text) {
    
    Node tail = new Node(text);
    
    if (head == null) {
      head = tail;
    } 
    else
    {
      Node current = head;
      while( current.next != null ) {
        current = current.next; 
      }   
      current.next = tail;
    }
    return text;
  }
  
  /**
   * Removes the first element from list
   * @return String the removed element
   */
  public String removeFromHead() {
    if (head == null) {
      System.out.println("Your list is empty!");
      return null;
    } 
    else
    {
      String temp = head.data;
      head = head.next;
      return temp;
    }
  }
  
  
  /**
   * Returns whether the list is empty
   * @return true if empty, otherwise false
   */
  public boolean isEmpty() {
    if (head == null)
      return true;
    return false;
  }
  
  /**
   * 
   * @param
   * @return 
   */
  public String getData(int index) {
    if (index < 0)
      return null;
    
    else if (head != null) {
      Node temp = head;  
      for (int i = 0; i < index; i++) {
        if (temp == null) //?????
          return null;
        temp = temp.next;
      }
      return temp.data;
    } 
    else
      return null;
  }
  
  
  /**
   * This method prints in reverse order
   */
  
  public void printReverse (){
    helper(head);
  }
  
//helper method
  private void helper(Node node) {
    if (node.next!= null){
      helper(node.next);
      System.out.println(node.data);
    }
    //base case
    else if ( node.next == null ){
      System.out.println(node.data);  
    }
  }
  
  /**
   * This method prints the elements.
   */
  public void print() {
    if (head != null) {
      Node temp = head;
      while (temp != null) {
        System.out.print( "[" + temp.data + "] ");
        temp = temp.next;
      }
    }
    System.out.println();
  }
  
  public void delete(String data){
    Node current = head;
    int i = 0;
    boolean found = false;
    while ( current != null && !found ){
      if ( current.data == data )
        found = true;
      else if ( current == null ){
        System.out.println("Not found!");
      }
      else{
        current = current.next;
        i++;
      }
    }
    Node temp = getNode(i-1);
    temp.next = getNode(i+1);   
  }  
  
  public void addToIndex(String data, int index){
    Node input = new Node(data);
    Node tempNext = getNode(index);
    Node temp = getNode(index-1);
    temp.next = input;
    input.next = tempNext;
    System.out.println( data + " is added to your list at the index " + index + "." );    
  }
  
  public Node getNode(int index) {
    if (index < 0)
      return null;
    
    else if (head != null) {
      Node temp = head;  
      for (int i = 0; i < index; i++) {
        if (temp == null) //?????
          return null;
        temp = temp.next;
      }
      return temp;
    } 
    else
      return null;
  }
  
  
//  private Node getPrevious( Node input ){
//    
//  }
//  private Node getNext( Node input ){
//    
//  }

}