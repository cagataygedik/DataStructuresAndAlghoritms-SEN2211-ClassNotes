package week5;

import java.util.Stack;

public class StackArrayBased {
	
	private int[] stackArray;
	private int size;
	private int top;
	
	public StackArrayBased(int newSize) {
		if (newSize <= 0) {
			size = 10;
		} else {
			size = newSize;
		}
		stackArray = new int[size];
		top = 0;
	}
	
	public StackArrayBased() {
		size = 10;
		stackArray = new int[size];
		top = 0;
	}
	
	public void initializeStack() {
		top = 0;
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
	
	public boolean isFull() {
		return (top == size);
	}
	
	//Adds a new element to the top of the stack.
	public boolean push(int newItem) {
		if(!isFull()) {
			stackArray[top] = newItem;
			top++;
			return true;
		} else {
			return false;
		}
	}
	
	//Removes the top element of the stack.
	public boolean pop() {
		if(!isEmpty()) {
			top--;
			return true;
		} else {
			return false;
		}
	}
	
	//Returns the top element of the stack.
	public int top() {
		assert (top == 0); //terminate the program if the stack is empty
		
		return stackArray[top - 1];
	}
	
	public void copyStack(StackArrayBased newStack) {
		size = newStack.size;
		top = newStack.top;
		stackArray= new int[size];
		for(int j = 0; j < top; j++)
			stackArray[j] = newStack.stackArray[j];
		}
	
	public StackArrayBased (StackArrayBased otherStack) {
		copyStack(otherStack);
		}
	
	public boolean equals(StackArrayBased otherStack) {
		if(size!= otherStack.size)
			return false;
		else
			for(int i = 0; i < size; i++)
				if(stackArray[i] != otherStack.stackArray[i])
					return false;
		return true;
		}
	
	public void outputStack() {
		if(top!= 0)
			for(int i = top-1; i >= 0; i--)
				System.out.println(stackArray[i]);
		}
}

