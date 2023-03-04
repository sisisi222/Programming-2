
public class QueueDemo {
	public static void main(String[] args) {
		QueueInterface<String> myQueue = new ImprovedQueue<String>();
		
		myQueue.enqueue("A");
		myQueue.enqueue("B");
		myQueue.enqueue("C");
		myQueue.enqueue("D");
		
		String discard = myQueue.dequeue(); 
		discard = myQueue.dequeue(); 
		
		while (isEmpty() == false) {
			String front;
			front = myQueue.dequeue();
			System.out.println(front);
		}
	}
}
