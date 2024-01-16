package week7;

public class QueueLinkedBased {
	private Node front;
	private Node rear;
	
	public QueueLinkedBased() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void initializeQueue() {
		front = null;
		rear = null;
	}
	
	public int getFront() {
		assert(front != null);
		return front.getInfo();
	}
	
	public int getRear() {
		assert(rear != null);
		return rear.getInfo();
	}
	
	public void addQueue(int newElement) {
		Node a = new Node(newElement);
		
		if (front == null)
			front = rear = a;
		else {
			rear.setLink(a);
			rear = rear.getLink();
		}
	}
	
	public void deleteQueue() {
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			front = front.getLink();
			if(front == null)
				rear = null;
		}
	}
	
	public void outputQueue() {
		if(!isEmpty()) {
			Node c = new Node();
			c = front;
			while (c != null) {
				System.out.println(c.getInfo());
				c = c.getLink();
			}
		}
	}
}

