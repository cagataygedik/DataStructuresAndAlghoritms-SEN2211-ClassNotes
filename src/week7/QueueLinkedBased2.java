package week7;

public class QueueLinkedBased2 {

	public static void main(String[] args) {
		QueueLinkedBased q = new QueueLinkedBased();
		int i, j;
		
		for(i = 1; i < 3; i++) {
			for(j = 7; j > 0; j -= 2) {
				q.addQueue(i * j % 5);
				if(i * j % 3 == 0)
					q.deleteQueue();
			}
			q.outputQueue();
		}
	}
	
/*   0
	 3
	 1
	 3
	 1
	 4
	 0
	 1
     2 
*/
}
