package week7;

public class QueueTestArrayBased {

	public static void main(String[] args) {
		QueueArrayBased a = new QueueArrayBased();
		a.addQueue(5); // 5
		a.addQueue(9); // 5 9 
		a.addQueue(8); // 5 9 8
		a.outputQueue(); // 5 9 8
		
		System.out.println("front:" + a.getFront()); // 5
		System.out.println("rear:" + a.getRear()); // 8
		
		a.addQueue(6); // 5 9 8 6
		System.out.println("after additon");
		a.outputQueue(); // 5 9 8 6
		a.deleteQueue(); // 9 8 6
		System.out.println("after deletion");
		a.outputQueue(); // 9 8 6
	}

}
