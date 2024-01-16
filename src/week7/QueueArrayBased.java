package week7;

public class QueueArrayBased {
	private int[] queueArray;
	private int size;
	private int front;
	private int rear;
	private int count;
	
	public QueueArrayBased() {
		size = 10;
		queueArray = new int[size];
		front = 0;
		rear = size - 1;
		count = 0;
	}
	
	public QueueArrayBased(int newSize) {
		if (newSize <= 0)
			size = 10;
		else
			size = newSize;
		
		queueArray = new int[size];
		front = 0;
		rear = size - 1;
		count = 0;
	}
	
	public void initializeQueue() {
		front = 0;
	}
	
	public boolean isEmpty() {
		return (count == 0);
	}
	
	public boolean isFull() {
		return (count == size);
	}
	
	public int getFront() {
		assert(isEmpty());
		return queueArray[front];
	}
	
	public int getRear() {
		assert(isEmpty());
		return queueArray[rear];
	}
	
	public void addQueue(int newElement) {
		if (!isFull()) {
			rear = (rear + 1) % size;
			count ++;
			queueArray[rear] = newElement;
		} else
			System.out.println("queue is full");
	}
	
	public void deleteQueue() {
		if (!isEmpty()) {
			count--;
			front = (front + 1) % size;
		} else {
			System.out.println("queue is empty");
		}
	}
	
	public void outputQueue() {
		if(count != 0)
			for(int i = front; i <= rear; i++)
				System.out.println(queueArray[i]);
	}
}











