package cs102.ds;

/**
 * Node Class
 */

public class Node {   
  //constructor
  public Node next;
  public String data;
  
  //property
  public Node(String data) {
    next = null;
    this.data = data;
  }   
}
