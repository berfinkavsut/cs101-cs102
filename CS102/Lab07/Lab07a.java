package cs102.ds;

public class Lab07a {
  
  public static void main(String[] args) {
    List list = new List();
    
    // Create list with some elements
    list.addToHead("apple");
    list.addToHead("banana");
    list.addToHead("orange");
    list.addToHead("pear");
    list.addToHead("melon");
    
    // Print the list
    System.out.println("Print");
    list.print();
    System.out.println();
    
    // Print the list in reverse
    System.out.println("Print in reverse order");  
    list.printReverse();
    System.out.println();
    
    // Add strawberry to list and show the updated list 
    System.out.println("Added: Strawberry");
    list.addToTail("strawberry");
    list.print();
    System.out.println();
    
    //Print the second element of the list
    System.out.println(list.getData(2));
    System.out.println();
    
    //Remove the first element from the list
    System.out.println("Remove Head:");
    list.removeFromHead();
    list.print();
    System.out.println();
    
    //getNode
    String str = "*********************************************";
    System.out.println(str);
    Node node = new Node("berfin");
    node = list.getNode(2);
    System.out.println(node.data);
    System.out.println(str);    
    
    // Delete banana
    System.out.println("Delete banana!");  
    list.delete("banana");
    list.print();
    
    // BERFIN
    list.addToIndex("BERFIN", 3);
    list.print();
  }
}
