package week3;

public class OrderedLinkedList {
	
	private Node first;
	private Node last;
	
	public OrderedLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	//Inserting new node to the any desired index.
	public void insert(String itemName) {
		if (isEmpty()) {
			first = last = new Node(itemName, first);
		} else {
			Node newItem = new Node(itemName);
			Node current = first;
			Node prev = new Node();
			
			while(current != null) {
				if(current.getItem().compareTo(itemName) > 0) {
					if (current == first) {
						newItem.setLink(first);
						first = newItem;
						break;
					} else {
						prev.setLink(newItem);
						newItem.setLink(current);
						break;
					}
				} else if (current == last ) {
					last.setLink(newItem);
					newItem.setLink(null);
					last = newItem;
				}
				prev = current;
				current = current.getLink();
			}
		}
	}
	
	//Removing any desired node from the list.
	public boolean remove(String itemName) {
		if(isEmpty()) {
			System.out.println("The list is empty!");
			return false;
		} else {
			Node current = first;
			Node prev = new Node();
			while(current != null) {
				if(current.getItem().equals(itemName)) {
					if(current == first) {
						first = current.getLink();
						return true;
					} else {
						prev.setLink(current.getLink());
						return true;
					}
				}
				prev = current;
				current = current.getLink();
			}
			System.out.println(itemName + "is not in the list");
			return false;
		}
	}
	
	public int size() {
		int count = 0;
		Node current = first;
		
		while (current != null) {
			count++;
			current = current.getLink();
		}
		return count;
	}
	
	public void outputList() {
		Node current = first;
		
		while (current != null) {
			System.out.println(current.getItem());
			current = current.getLink();
		}
	}
}
