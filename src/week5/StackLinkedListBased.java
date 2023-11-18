package week5;

public class StackLinkedListBased {
	
	private Node top;

 public StackLinkedListBased() {
	top = null;
   }

 public boolean isEmpty() {
	return(top == null);
   }
 
 public void initializeStack() {
	 top = null;
   }
 
  public void push(int newElement) {
	  Node newNode = new Node(newElement);
	  newNode.setLink(top);
	  top = newNode;
  }
  
  // returns the top element of the stack
  public int top() {
	  assert( top == null); //terminate the program if the stack is empty
	  return top.getInfo();
	  }
  
  public boolean pop() {
	  if(isEmpty()) 
		  return false;
	  else {
		  top = top.getLink();
		  return true;
		  }
	  }
  
  public void outputLinkedStack() {
	  Node current = top;
	  while(current != null) {
		  System.out.println(current.getInfo());
		  current = current.getLink();
		  }
	  }
  
  public void copyStack(StackLinkedListBased otherStack) {
	  top = otherStack.top;
         }
  
  public boolean equals(StackLinkedListBased otherStack) {
	  if(top == otherStack.top)
		  return true;
	  else 
		  return false;
	  }
  
  public int size() {
	  int count = 0;
	  Node current = top;
	  while(current != null) {
		  count++;
		  current = current.getLink();
		  }
	  return count;
	  }
  }
