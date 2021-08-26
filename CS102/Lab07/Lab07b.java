package cs102.ds;

import java.util.Scanner;

public class Lab07b {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    Stack stack = new Stack();
    
    int result;
    int num1;
    int num2;
    
    System.out.print("Operate: ");
    String operation = scan.nextLine();
    
    result = 0;
    for (int i = 0; i < operation.length(); i++) {
      //if number, push it to the stack    
      if (Character.isDigit(operation.charAt(i))) {
        stack.push(operation.charAt(i) + "");
      } 
      //else make the operation
      else 
      {
        //Pop the last two numbers from the stack
        num1 = Integer.parseInt(stack.pop());
        num2 = Integer.parseInt(stack.pop());    
        
        //Make the operations
        if (operation.charAt(i) == '+') {
          result = num2 + num1;
        }         
        else if (operation.charAt(i) == '-') {
          result = num2 - num1;
        } 
        else if (operation.charAt(i) == '*') {
          result = num2 * num1;
        } 
        else if (operation.charAt(i) == '/') {
          result = num2 / num1;
        } 
        else {
          result = 0;
        }
        //Push the result to the stack
        stack.push("" + result);
      }
    }
    
    //Show the operation's result
    System.out.println("Your operation is over. The result is " + stack.pop() + ".");
    
  }
}