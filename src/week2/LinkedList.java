package week2;

public class LinkedList {
	
	private Node first;
	private Node last; 
	
	public LinkedList() {
		first = null;last= null;
		}
	
	public boolean isEmpty() {
		return(first == null); 
		}
	
	//Inserting new node to the front.
	public void insertAtFront(String itemName) {
		if(isEmpty())
			first = last = new Node(itemName, first);
		else 
			first = new Node(itemName, first);
		}
	
	//Removing the node from the first index.
	public boolean removeFromFront() {
		if(isEmpty()) {
			System.out.println("The list is empty!");
			return false;
			} else {
				if(first == last)
					first = last = null;
				else 
					first = first.getLink();
				return true;
				}
		}
	
	//Inserting new node to the last index.
	public void insertAtBack(String itemName) {
		if(isEmpty())
			first = last = new Node(itemName, first);
		else {
			last.setLink(new Node (itemName));
			last = last.getLink();
			}
		}
	
	//Removing the node from the last index.
	public boolean removeFromBack() {
		if(isEmpty()) {
			System.out.println("The list is empty!");
			return false;
			} else {
				if(first == last)
					first = last = null;
				else {
					Node current = first;
					while(current.getLink() != last)
						current = current.getLink();
					last = current;
					current.setLink(null);
				}
				return true;
			}
		}
	
	public int size() {
		int count = 0;
		Node current = first;
		while(current != null) {
			count++;
			current = current.getLink();
			}
		return count;
		}
	
	public void outputList() {
		Node current = first;
		while(current != null) {
			System.out.println(current.getItem());
			current = current.getLink();
			}
		}
	
	private Node find(String target) {
		Node position = first;
		String itemAtPosition;
		while(position != null) {
			itemAtPosition= position.getItem();
			if(itemAtPosition.equals(target))
				return position;
			position = position.getLink();
			}
		return null;
	}
	
	public boolean contains(String item) {
		return(find(item) != null);
		}
	}

