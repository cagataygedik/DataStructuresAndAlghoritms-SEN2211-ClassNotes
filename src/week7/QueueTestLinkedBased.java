package week7;

public class QueueTestLinkedBased {

	public static void main(String[] args) {
		QueueLinkedBased q = new QueueLinkedBased();
		int x, y;
		x = 4;
		y = 5;
		q.addQueue(x); // 4
		q.addQueue(y); // 4 5
		x = q.getFront();
		q.deleteQueue(); // 5
		q.addQueue(x + 5); // 5 9
		q.addQueue(16); // 5 9 16
		q.addQueue(16); // 5 9 16 16
		q.addQueue(y - 3); // 5 9 16 16 2
		q.outputQueue(); // 5 9 16 16 2
	}

}
