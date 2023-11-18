package week4;

public class DoubleLinkedList {
	
	private Node first;
	private Node last;
	
	public DoubleLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertAtFront(String itemName) {
		Node a = new Node(itemName);
		a.setNext(first); //our new item's next value is first one in the list.
		first.setPrev(a); //our new item is going to be prev item of the first one.
		first = a; //now, our item is going to be first item.
	}
	
	public void removeFromFront() {
		first = first.getNext(); //our first item will going to be first item's next value.
		first.setPrev(null);
	}
	
	public void insertAtBack(String itemName) {
		Node a = new Node(itemName);
		a.setPrev(last); //new item's prev value is last item in the index.
		a.setNext(null); //new item's next item is null.
		last.setNext(a); //last item in the index next value is our new item.
		last = last.getNext(); // our new item going to be last item.
	}
	
	public void removeFromBack() {
		last = last.getPrev();
		last.setNext(null);
	}
	
	public void outputListBackward() {
		Node current = last;
		while(current != null) {
			System.out.println(current.getItem());
			current = current.getPrev();
			}
		}
	
	/* Sayfa 19-34 - 4. Slayt'tan calis. */
	
	}

