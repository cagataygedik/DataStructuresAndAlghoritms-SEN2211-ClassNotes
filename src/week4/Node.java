package week4;

public class Node {
	
	private String item;
	private Node prev;
	private Node next;
	
	public Node() {
		prev = null;
		next = null;
		item = null;
	}
	
	public Node(String newItem) {
		setItem(newItem);
		prev = null;
		next = null;
	}
	
	public Node(String newItem, Node nextValue) {
		setItem(newItem);
		prev = null;
		next = nextValue;
	}
	
	public Node(String newItem, Node prevValue, Node nextValue) {
		setItem(newItem);
		prev = prevValue;
		next = nextValue;
	}

	public void setItem(String newItem) {
		item = newItem;
	}

	public void setPrev(Node newPrev) {
		prev = newPrev;
	}


	public void setNext(Node newNext) {
		next = newNext;
	}
	
	public String getItem() {
		return item;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public Node getNext() {
		return next;
	}


}
